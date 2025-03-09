package com.judgesphere.models.data;
import jakarta.persistence.*;

@Entity
@Table(name = "users")

public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, nullable = false)
    private String username;
    private String password;
    @Column(nullable = false)
    private String role= "USER";

    
    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.role = "USER";
    }
    public String getUsername(){
        return this.username;
    }
    public String getPassword(){
        return this.password;
    }
}