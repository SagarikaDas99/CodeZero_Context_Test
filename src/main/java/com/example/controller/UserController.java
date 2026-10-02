package com.example.controller;

import com.example.model.User;
import com.example.repo.UserRepo;
import com.example.service.UserService;

public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public String register(User user) {
        return userService.registerUser(user);
    }

    public static UserController createController() {

        UserRepo repository = new UserRepo();

        UserService service = new UserService(repository);

        return new UserController(service);
    }
}