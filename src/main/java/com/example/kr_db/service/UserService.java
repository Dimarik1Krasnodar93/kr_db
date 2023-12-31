package com.example.kr_db.service;

import com.example.kr_db.model.User;
import com.example.kr_db.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User create(User user) {
        return userRepository.create(user);
    }
}
