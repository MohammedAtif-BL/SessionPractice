package com.bridgelabz.springexample.dto;

import com.bridgelabz.springexample.entity.Address;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequestDTO {
    // [1,2,3] -> valid
    //["a","b","c"] -> valid

    // null , [] , {} invalid
//    @NotEmpty(message = "Name should not be empty")
    @Pattern(regexp = "^[A-Z][a-zA-Z]{2,}$", message = "Pattern mismatch Min 3 characters eg= Sam")
    private String fName;

    // name = "ABC" , name= ""  age=0 -> valid
    // name = null -> invalid
    @NotNull
    private String lName;

    @Email
    private String emailId;

    // name = "ABC", "123"
    // name=""
//    @NotBlank
    private List<Address> address;

    private List<String> departments;


    @Min(value = 18,message = "Age must be 18+")
    @Max(value = 50, message = "Age limit less then 50")
    private int age;

    //YYYY-MM-DD format for localdate
    @Past(message = "BirthDate must be a past date")
    private LocalDate birthDate;

    @Future(message = "Event date must be a future date")
    private LocalDate eventDate;

    @PastOrPresent(message = "Registration date must be past or present date")
    private LocalDate registrationDate;

    @FutureOrPresent
    private LocalDate bookingDate;
}
