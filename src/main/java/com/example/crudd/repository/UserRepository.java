package com.example.crudd.repository;

import com.example.crudd.entity.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    private final List<User> userList;

    public UserRepository() {
        this.userList = new ArrayList<>();
    }

    public void createUser(User user) {
        userList.add(user);
    }


    public List<User> getAllUsers() {
        return userList;
    }

    public User getUserById(int id) {
        return userList.stream()
                .filter(user -> user.getId() == id)
                .findFirst()
                .orElse(null);
    }


    public void updateUser(int id, User updatedUser) {
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getId() == id) {
                userList.set(i, updatedUser);
                return;
            }
        }
    }

    public void deleteUser(int id) {
        userList.removeIf(user -> user.getId() == id);
    }
}
