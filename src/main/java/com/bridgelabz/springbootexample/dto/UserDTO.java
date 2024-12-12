package com.bridgelabz.springbootexample.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    @NotBlank
    @Pattern(regexp = "^[A-Z][a-z]{2,}$", message = "Patter not matched")
    private String fName;

    @NotBlank(message = "Name Cannot be Blank")
    private String lName;

    @Email
    private String email;

    @Min(value = 18,message = "You are not eligible must be 18+")
    @Max(value = 55,message = "Age should be less than 55")
    @NotNull
    private int age;

    @Past
    private LocalDate birthDate;

    @Future
    private LocalDate eventDate;

    @PastOrPresent(message = "Registration date must be past or present date")
    private LocalDate registrationDate;

    @FutureOrPresent
    private LocalDate bookingDate;
}
