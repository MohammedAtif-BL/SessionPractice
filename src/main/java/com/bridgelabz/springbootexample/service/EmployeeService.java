package com.bridgelabz.springbootexample.service;

import com.bridgelabz.springbootexample.dto.EmployeeDTO;
import com.bridgelabz.springbootexample.model.Employee;

import java.util.List;

public interface EmployeeService {

    Employee addEmployee(EmployeeDTO employeeDTO);

    List<Employee> getEmployeeByName(String name);

    List<Employee> getEmployeeByCityName(String cityName);
}
