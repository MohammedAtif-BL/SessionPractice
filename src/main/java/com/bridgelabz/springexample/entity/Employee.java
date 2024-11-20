package com.bridgelabz.springexample.entity;

import com.bridgelabz.springexample.dto.RequestDTO;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "User_Data")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    @GeneratedValue
    private long emp_id;

    @Column(name = "First_Name")
    private String fName;

    private String lName;
    private String address;
    private int age;
    private LocalDate doj;

    public Employee(RequestDTO requestDTO) {
        this.address = requestDTO.getAddress();
        this.fName = requestDTO.getFName();
        this.lName = requestDTO.getLName();
        this.age = requestDTO.getAge();
        this.doj = LocalDate.now();
    }
}
