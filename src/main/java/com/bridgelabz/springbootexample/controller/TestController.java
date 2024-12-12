package com.bridgelabz.springbootexample.controller;

import com.bridgelabz.springbootexample.dto.UserDTO;
import com.bridgelabz.springbootexample.model.User;
import com.bridgelabz.springbootexample.service.IUserService;
import com.bridgelabz.springbootexample.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
//@Controller
//@ResponseBody
@RequestMapping("/test")
public class TestController {

    @Autowired
    private IUserService userService;

//    @RequestMapping(value = "/test",method = RequestMethod.GET)
    @GetMapping("/test")
    public String message(){
        return "Hello World from Test Controller";
    }

    @RequestMapping(value = "/test1/{name}/{message}",method = RequestMethod.GET)
    public String message1(@PathVariable String name,@PathVariable String message){
        return "Hello "+name+ " "+ message;
    }

    @RequestMapping(value = "/test2",method = RequestMethod.GET)
    public String message2(@RequestParam String name, @RequestParam(defaultValue = "Default Parameter Required") String message){
        return "Hello "+name+ " "+ message;
    }

//    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @PostMapping("/add")
    public UserDTO add(@Valid @RequestBody UserDTO userDTO){
        return userService.addUser(userDTO);
    }

    @GetMapping("/getall")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    @GetMapping("/{id}")
    public UserDTO getUserById(@PathVariable Long id){
        return userService.getById(id);
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id,@Valid @RequestBody User user){
        return userService.updateUser(id,user);
    }
}
