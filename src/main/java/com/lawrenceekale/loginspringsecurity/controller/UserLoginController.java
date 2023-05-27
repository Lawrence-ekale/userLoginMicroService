package com.lawrenceekale.loginspringsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserLoginController {

    @GetMapping("/home")
    public String home() {
        return "This is home page";
    }

    @GetMapping("/admin")
    public String admin() {
        return "This is Admin Page";
    }
}
