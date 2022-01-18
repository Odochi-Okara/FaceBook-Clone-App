package com.example.facebook_app.service;

import com.example.facebook_app.model.User;
import com.example.facebook_app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User getUserByEmail(String email) {
        return userRepository.getUserByEmail(email);
    }

    public void addUser(User user) {
        userRepository.save(user);
    }

    public User getUserByEmailAndPassword(String email, String password) {
        return userRepository.getUserByEmailAndPassword(email, password);
    }
}
