package com.bridgelabz.springexample.service;

import com.bridgelabz.springexample.dto.RequestDTO;
import com.bridgelabz.springexample.entity.Employee;

import java.util.List;

public interface EmployeeService {
    RequestDTO addEmployee(RequestDTO requestDTO);

    List<Employee> getAllEmployee();

    Employee getEmployeeById(long id);
}
