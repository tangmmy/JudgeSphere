package com.judgesphere.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @PostMapping
    public String ping() {
        return "pong";
    }

}
