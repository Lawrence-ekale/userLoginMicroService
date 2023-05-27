package com.lawrenceekale.loginspringsecurity.service;

import com.lawrenceekale.loginspringsecurity.entity.User;
import com.lawrenceekale.loginspringsecurity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserGeneralService {
    @Autowired
    private UserRepository userRepository;


    public String registerUser(User user) {
        userRepository.save(user);
        return "Registered Successfully";
    }
}
