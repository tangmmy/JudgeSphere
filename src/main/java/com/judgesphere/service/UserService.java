package com.judgesphere.service;

import java.util.concurrent.CompletableFuture;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import com.judgesphere.models.service.UserDto;
import com.judgesphere.exception.UserAlreadyExistsException;
import com.judgesphere.models.data.User;
import com.judgesphere.service.interfaces.IUserService;
import com.judgesphere.repository.UserRepository;
import org.springframework.scheduling.annotation.EnableAsync;

@Service("UserService")
public class UserService implements IUserService {
    @Autowired
    private final UserRepository userRepository;
    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    @Async
    public CompletableFuture<Boolean> RegisterUserAsync(UserDto userDto) {
        return CompletableFuture.supplyAsync(() -> {
            try {
              
                User user = new User(userDto.getUsername(), userDto.getPassword());
                userRepository.save(user);
                logger.info("User '{}' registered successfully.", user.getUsername());
                return true;
            } catch (DataIntegrityViolationException e) {
                logger.warn("Registration failed: Username '{}' already exists.", userDto.getUsername());
                throw new UserAlreadyExistsException("Registration failed: Username " +userDto.getUsername()+ " already exists.");
            } catch (Exception e) {
                logger.error("Unexpected error: {}", e.getMessage(), e);
                return false;
            }
        });
    }
}
