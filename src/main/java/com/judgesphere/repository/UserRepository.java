package com.judgesphere.repository;

import com.judgesphere.models.data.User;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>  {
    User findByUsername(String username);
    void deleteByUsername(String username);  
    List<User> findByRole(String role);
    boolean existsByUsername(String username);  
}
