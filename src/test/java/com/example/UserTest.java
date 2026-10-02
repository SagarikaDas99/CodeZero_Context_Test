package com.example;

import com.example.controller.UserController;
import com.example.model.User;

public class UserTest {

    public static void main(String[] args) {

        UserController controller = UserController.createController();

        User user1 = new User(1, "Sagarika", "test@gmail.com");

        User user2 = new User(2, "Rahul", "test@gmail.com");

        String result1 = controller.register(user1);

        String result2 = controller.register(user2);

        System.out.println("First registration: " + result1);
        System.out.println("Second registration: " + result2);
    }
}
