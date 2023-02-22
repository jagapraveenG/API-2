package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ex4{
    @GetMapping
    public String getName(){
        return "Welcome";
    }
}