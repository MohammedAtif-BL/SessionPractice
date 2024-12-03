package com.bridgelabz.springexample.service;

import com.bridgelabz.springexample.dto.RequestDTO;
import com.bridgelabz.springexample.entity.Address;
import com.bridgelabz.springexample.entity.Employee;
import com.bridgelabz.springexample.exception.CustomException;
import com.bridgelabz.springexample.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private EmailService emailService;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public String addEmployee(RequestDTO requestDTO) {

        emailService.sendEmail(requestDTO.getEmailId(), "Data","Email Body");
//        Employee employee = new Employee(requestDTO);
//        List<Address> addresses = requestDTO.getAddress();
//        addresses.forEach(address -> address.(employee));
//
//        employee.setAddress(addresses);
//        return mapToDTO(employeeRepository.save(employee));
        return "Success";
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(long id) {
        return employeeRepository.findById(id).orElseThrow(()->new CustomException("ID not found"));
    }

    public RequestDTO mapToDTO(Employee employee){
//        RequestDTO requestDTO = new RequestDTO();
//        requestDTO.setLName(employee.getFName());
//        requestDTO.setLName(employee.getLName());
//        requestDTO.setAge(employee.getAge());
//        requestDTO.setDepartments(employee.getDepartments());
//        requestDTO.setAddress(employee.getAddress());
//        return requestDTO;
        return null;
    }
}
