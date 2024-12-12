package com.bridgelabz.springbootexample.model;

import com.bridgelabz.springbootexample.dto.AddressDTO;
import com.bridgelabz.springbootexample.dto.EmployeeDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@Entity
@Table(name = "Emp_data")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    @GeneratedValue
    private long emp_id;

    @Column(name = "employee_Name")
    private String empName;

    private Double salary;

    @ElementCollection
    @CollectionTable(name = "phone_data", joinColumns = @JoinColumn(name = "id"))
    private List<String> phoneNo;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    private List<Address> address;
}
