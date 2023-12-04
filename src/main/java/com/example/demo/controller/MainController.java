package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("greeting")
    public String greet(){
        return "<h1>Hello World</h1>";
    }
}
