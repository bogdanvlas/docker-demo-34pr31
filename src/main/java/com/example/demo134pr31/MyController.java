package com.example.demo134pr31;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping
    public String sayHello() {
        return "Hello, world!";
    }
}
