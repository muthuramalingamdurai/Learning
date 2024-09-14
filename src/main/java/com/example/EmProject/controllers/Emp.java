package com.example.EmProject.controllers;

import com.example.EmProject.mappers.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@RestController
public class Emp {
    @GetMapping("/user")
    public User getUser(){
       User user = new User();
       user.setAge(25);
       user.setName("Muthu");
       user.setRole("Admin");
        return user;
    }
}
