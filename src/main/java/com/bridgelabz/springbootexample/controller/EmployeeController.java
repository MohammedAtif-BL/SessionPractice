package com.bridgelabz.springbootexample.controller;

import com.bridgelabz.springbootexample.dto.EmployeeDTO;
import com.bridgelabz.springbootexample.model.Employee;
import com.bridgelabz.springbootexample.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public Employee addEmployee(@RequestBody EmployeeDTO employeeDTO){
        return employeeService.addEmployee(employeeDTO);
    }

    @GetMapping("/{name}")
    public List<Employee> searchEmployee(@PathVariable String name){
        return employeeService.getEmployeeByName(name);
    }

    @GetMapping("/search/{cityName}")
    public List<Employee> getEmployeeByCity(@PathVariable String cityName){
        return employeeService.getEmployeeByCityName(cityName);
    }
}
