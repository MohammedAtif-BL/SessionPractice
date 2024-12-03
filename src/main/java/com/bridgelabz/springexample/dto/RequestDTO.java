package com.bridgelabz.springexample.dto;

import com.bridgelabz.springexample.entity.Address;
import jakarta.validation.constraints.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

//@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
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

    public @Pattern(regexp = "^[A-Z][a-zA-Z]{2,}$", message = "Pattern mismatch Min 3 characters eg= Sam") String getfName() {
        return fName;
    }

    public void setfName(@Pattern(regexp = "^[A-Z][a-zA-Z]{2,}$", message = "Pattern mismatch Min 3 characters eg= Sam") String fName) {
        this.fName = fName;
    }

    public @NotNull String getlName() {
        return lName;
    }

    public void setlName(@NotNull String lName) {
        this.lName = lName;
    }

    public @Email String getEmailId() {
        return emailId;
    }

    public void setEmailId(@Email String emailId) {
        this.emailId = emailId;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    public List<String> getDepartments() {
        return departments;
    }

    public void setDepartments(List<String> departments) {
        this.departments = departments;
    }

    @Min(value = 18, message = "Age must be 18+")
    @Max(value = 50, message = "Age limit less then 50")
    public int getAge() {
        return age;
    }

    public void setAge(@Min(value = 18, message = "Age must be 18+") @Max(value = 50, message = "Age limit less then 50") int age) {
        this.age = age;
    }

    public @Past(message = "BirthDate must be a past date") LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(@Past(message = "BirthDate must be a past date") LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public @Future(message = "Event date must be a future date") LocalDate getEventDate() {
        return eventDate;
    }

    public void setEventDate(@Future(message = "Event date must be a future date") LocalDate eventDate) {
        this.eventDate = eventDate;
    }

    public @PastOrPresent(message = "Registration date must be past or present date") LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(@PastOrPresent(message = "Registration date must be past or present date") LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public @FutureOrPresent LocalDate getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(@FutureOrPresent LocalDate bookingDate) {
        this.bookingDate = bookingDate;
    }
}
