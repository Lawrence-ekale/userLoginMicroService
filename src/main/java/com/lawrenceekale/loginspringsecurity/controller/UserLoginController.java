package com.lawrenceekale.loginspringsecurity.controller;

import com.lawrenceekale.loginspringsecurity.entity.User;
import com.lawrenceekale.loginspringsecurity.service.UserGeneralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class UserLoginController {
    @Autowired
    private UserGeneralService userGeneralService;

    @PostMapping("/register")
    public String registerUser(@RequestBody User user) {
        return userGeneralService.registerUser(user);
    }

    @GetMapping("/")
    public String generalPage() {
        return "You are in general page";
    }

    @GetMapping("/home")
    public String home() {
        return "This is home page";
    }

    @GetMapping("/admin")
    public String admin() {
        return "This is Admin Page";
    }
}
