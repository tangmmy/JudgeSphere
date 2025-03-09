package com.judgesphere.controllers;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.judgesphere.models.request.RegisterUserRequest;
import com.judgesphere.models.response.ErrorResponse;
import com.judgesphere.models.response.RegisterUserResponse;
import com.judgesphere.models.service.UserDto;
import com.judgesphere.service.interfaces.IUserService;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/api/user")
public class UserController {

    private final IUserService _userService;

    @Autowired
    public UserController(@Qualifier("UserService") IUserService userService){
        this._userService = userService;
    }


    @PostMapping("/register")
    public CompletableFuture<ResponseEntity<RegisterUserResponse>> RegisterUser(@Valid @RequestBody RegisterUserRequest request) {
        UserDto userDto = new UserDto(request.getUsername(), request.getPassword());
        return _userService.RegisterUserAsync(userDto)
        .thenApply(result -> ResponseEntity.ok(new RegisterUserResponse(result)));             
    }
}




