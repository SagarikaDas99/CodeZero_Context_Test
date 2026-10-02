package com.example.service;

import com.example.model.User;
import com.example.repo.UserRepo;

public class UserService {

    private UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public String registerUser(User user) {

        if (userRepo.existsByEmail(user.getEmail())) {
            return "Email already exists";
        }

        userRepo.save(user);

        return "User registered successfully";
    }
}
