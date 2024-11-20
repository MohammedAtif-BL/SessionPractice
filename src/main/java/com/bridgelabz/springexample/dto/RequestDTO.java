package com.bridgelabz.springexample.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequestDTO {
    private String fName;
    private String lName;
    private String address;
    private int age;
}
