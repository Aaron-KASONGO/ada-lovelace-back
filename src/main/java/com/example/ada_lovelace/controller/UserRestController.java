package com.example.ada_lovelace.controller;

import com.example.ada_lovelace.data.User;
import com.example.ada_lovelace.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class UserRestController {
    private final UserService userService;

    public UserRestController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("users")
    public List<User> getUsers() {
        return (List<User>) userService.getUserRepository().findAll();
    }
}
