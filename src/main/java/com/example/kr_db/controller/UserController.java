package com.example.kr_db.controller;

import com.example.kr_db.model.User;
import com.example.kr_db.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    @GetMapping("/findAll")
    public List<User> findAll() {

        return userService.findAll();
    }

    @PostMapping("/create")
    public User create(@RequestBody User user) {
        return userService.create(user);
    }
}
