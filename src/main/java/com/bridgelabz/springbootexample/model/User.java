package com.bridgelabz.springbootexample.model;

import com.bridgelabz.springbootexample.dto.UserDTO;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "user_table")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long user_id;

    @Column(name = "First_Name")
    private String fName;

    private String lName;

    private LocalDate registration;

    public User(UserDTO userDTO) {
        this.fName = userDTO.getFName();
        this.lName = userDTO.getLName();
        this.registration = LocalDate.now();
    }
}
