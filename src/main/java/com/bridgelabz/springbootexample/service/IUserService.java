package com.bridgelabz.springbootexample.service;

import com.bridgelabz.springbootexample.dto.UserDTO;
import com.bridgelabz.springbootexample.exception.UserNotFoundException;
import com.bridgelabz.springbootexample.model.User;

import java.util.List;

public interface IUserService {
    UserDTO addUser(UserDTO user);

    List<User> getAllUser();

    UserDTO getById(Long id) throws UserNotFoundException;

    User updateUser(Long id, User user) throws UserNotFoundException;
}
