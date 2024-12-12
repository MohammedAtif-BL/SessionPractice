package com.bridgelabz.springbootexample.service;

import com.bridgelabz.springbootexample.dto.UserDTO;
import com.bridgelabz.springbootexample.exception.UserNotFoundException;
import com.bridgelabz.springbootexample.model.User;
import com.bridgelabz.springbootexample.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements IUserService{

    @Autowired
    private UserRepository userRepository;

    public UserDTO addUser(UserDTO userDTO){
        User user_Data = new User(userDTO);
        return mapToDTO(userRepository.save(user_Data));

    }

    //COnvert User Entity to DTO
    private UserDTO mapToDTO(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setFName(user.getFName());
        userDTO.setLName(user.getLName());
        return userDTO;
    }

    public List<User> getAllUser(){
        return userRepository.findAll();
    }

    public UserDTO getById(Long id) {
        return mapToDTO(userRepository.findById(id).orElseThrow(()-> new UserNotFoundException("ID Not found")));
    }

    public User updateUser(Long id, User user) {
//        User user_data = getById(id);
//        if (user_data !=null){
//            user_data.setFName(user.getFName());
//            user_data.setLName(user.getLName());
//            return userRepository.save(user_data);
//        }
        return null;
    }
}
