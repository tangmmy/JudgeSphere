package com.judgesphere.models.service;


public class UserDto {
    private String username;
    private String password;
    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }
    public UserDto(String username,String password){
        this.username = username;
        this.password = password;
    }
}
