package com.example.portfolio.manager.controller;

import com.example.portfolio.manager.model.User;
import com.example.portfolio.manager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User newUser = userService.saveUser(user);
        logger.info("New user created: {}", user.getUsername()); // Add this line
        return ResponseEntity.ok(newUser);
    }
}
