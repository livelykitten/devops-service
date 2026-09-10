package com.example.devops_service;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController 
public class AppController {
    @GetMapping("/")
    public String getMethodName() {
        return "Hello, World";
    }
    
}
