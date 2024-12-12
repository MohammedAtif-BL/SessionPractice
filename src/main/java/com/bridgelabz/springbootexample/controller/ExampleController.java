package com.bridgelabz.springbootexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/example")
public class ExampleController {
    @GetMapping("/test")
    public String message(){
        return "Hello World from Example Controller";
    }
}
