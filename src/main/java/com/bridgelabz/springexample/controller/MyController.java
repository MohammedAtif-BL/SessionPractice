package com.bridgelabz.springexample.controller;

import com.bridgelabz.springexample.dto.RequestDTO;
import com.bridgelabz.springexample.entity.Employee;
import com.bridgelabz.springexample.service.EmployeeServiceImpl;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@Controller
//ResponseBody
@Slf4j
@RequestMapping("/mycontroller")
public class MyController {

    @Autowired
    private EmployeeServiceImpl employeeService;

    @RequestMapping(value = "/home",method = RequestMethod.GET)
    public String message(){
        return "My Controller";
    }

//    @PathVariable
    @RequestMapping(value = "/hello/{name}",method = RequestMethod.GET)
    public String message1(@PathVariable String name){
        return "Some Message: " + name;
    }
//    @RequestParam
    @RequestMapping(value = "/param",method = RequestMethod.GET)
    public String message2(@RequestParam(defaultValue = "Param required") String fName,@RequestParam String lName){
        return "Request Param Example:  " + fName + " " + lName;
    }

//    @RequestBody
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addEmployee(@Valid @RequestBody RequestDTO requestDTO){
        return employeeService.addEmployee(requestDTO);
    }

    @GetMapping
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable long id){
        return employeeService.getEmployeeById(id);
    }

//    @PutMapping("/{id}")
//    public Employee updateEmployee(@PathVariable long id,@RequestBody Employee employee){
//        return employeeService.updateEmployee(id,employee);
//    }
}
