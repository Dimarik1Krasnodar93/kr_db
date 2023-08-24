package com.example.kr_db.repository;

import com.example.kr_db.model.User;

import java.util.List;

public interface UserRepository {
    List<User> findAll();
    User create(User user);
}
