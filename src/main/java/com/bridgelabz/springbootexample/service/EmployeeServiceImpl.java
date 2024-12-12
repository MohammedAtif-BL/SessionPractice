package com.bridgelabz.springbootexample.service;

import com.bridgelabz.springbootexample.dto.AddressDTO;
import com.bridgelabz.springbootexample.dto.EmployeeDTO;
import com.bridgelabz.springbootexample.model.Address;
import com.bridgelabz.springbootexample.model.Employee;
import com.bridgelabz.springbootexample.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Employee addEmployee(EmployeeDTO employeeDTO) {
        Employee employee_data = new Employee();
        employee_data.setEmpName(employeeDTO.getEmpName());
        employee_data.setSalary(employeeDTO.getSalary());

//        List<Address> addresses = employeeDTO.getAddresses();
//        addresses.forEach(address -> address.setEmployee(employee_data));

        List<Address> addresses = new ArrayList<>();
        if (employeeDTO.getAddresses() != null) {
            employeeDTO.getAddresses().forEach(dtoAddress -> {
                Address address = new Address();
                address.setStreet(dtoAddress.getStreet());
                address.setCity(dtoAddress.getCity());
                address.setState(dtoAddress.getState());
                address.setPinCode(dtoAddress.getPinCode());
                address.setEmployee(employee_data); // Set the Employee reference
                addresses.add(address);
            });
        }
        employee_data.setAddress(addresses);
        return employeeRepository.save(employee_data);
    }

    @Override
    public List<Employee> getEmployeeByName(String name) {
        return employeeRepository.findByEmpName(name);
    }

    @Override
    public List<Employee> getEmployeeByCityName(String cityName) {
        return employeeRepository.findEmployeesByCity(cityName);
    }

}
