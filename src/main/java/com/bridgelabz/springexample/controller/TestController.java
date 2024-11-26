package com.bridgelabz.springexample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testcontroller")
public class TestController {
    @RequestMapping(value = "/home",method = RequestMethod.GET)
    public String message(){
        return "Test Controller";
    }

}
