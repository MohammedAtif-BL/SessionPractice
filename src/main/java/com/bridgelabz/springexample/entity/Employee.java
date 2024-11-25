package com.bridgelabz.springexample.entity;

import com.bridgelabz.springexample.dto.RequestDTO;
import jakarta.persistence.*;
import lombok.*;
import org.w3c.dom.stylesheets.LinkStyle;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "User_Data")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long emp_id;

    @Column(name = "First_Name")
    private String fName;

    private String lName;
    private int age;
    private LocalDate doj;

    @ElementCollection
    @CollectionTable(name = "department_data",joinColumns = @JoinColumn(name="employee_id"))
    private List<String> departments;

    @OneToMany(mappedBy = "employee",cascade = CascadeType.ALL)
    private List<Address> address;

    public Employee(RequestDTO requestDTO) {
        this.fName = requestDTO.getFName();
        this.lName = requestDTO.getLName();
        this.age = requestDTO.getAge();
        this.doj = LocalDate.now();
        this.departments = requestDTO.getDepartments();
    }
}
