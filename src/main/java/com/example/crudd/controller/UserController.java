package com.example.crudd.controller;

import com.example.crudd.entity.User;
import com.example.crudd.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping
    public void createUser(@RequestBody User user) {
        userRepository.createUser(user);
    }


    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable int id) {
        return userRepository.getUserById(id);
    }

    @PutMapping("/{id}")
    public void updateUser(@PathVariable int id, @RequestBody User updatedUser) {
        userRepository.updateUser(id, updatedUser);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable int id) {
        userRepository.deleteUser(id);
    }


}
