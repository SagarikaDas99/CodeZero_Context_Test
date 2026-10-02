package com.example.repo;

import com.example.model.User;
import java.util.ArrayList;
import java.util.List;

public class UserRepo {

    private List<User> users = new ArrayList<>();

    public boolean existsByEmail(String email) {

        for (User user : users) {

            if (user.getEmail().equalsIgnoreCase(email)) {
                return true;
            }
        }

        return false;
    }

    public void save(User user) {
        users.add(user);
    }

    public int count() {
        return users.size();
    }
}