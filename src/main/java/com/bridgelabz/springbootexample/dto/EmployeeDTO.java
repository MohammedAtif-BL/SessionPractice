package com.bridgelabz.springbootexample.dto;

import com.bridgelabz.springbootexample.model.Address;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class EmployeeDTO {
    private long empId;
    private String empName;
    private Double salary;
    private List<AddressDTO> addresses;

    public EmployeeDTO(long empId, String empName, Double salary, List<AddressDTO> addresses) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.addresses = addresses;
    }
}
