package com.judgesphere.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/health")
public class HealthController {
    @GetMapping
    public String ping() {
        return "pong";
    }

}
