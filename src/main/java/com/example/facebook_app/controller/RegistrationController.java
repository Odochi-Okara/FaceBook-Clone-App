package com.example.facebook_app.controller;

import com.example.facebook_app.model.User;
import com.example.facebook_app.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {
    final
    UserService userService;

    public RegistrationController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/register")
    public String getRegistrationPage(Model model){
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/register")
    public String signUp(User user, Model model) {
        User userRegistered = userService.getUserByEmail(user.getEmail());
        if (userRegistered != null) {
            model.addAttribute("failed", "User with Email Already exist");
            return "register";
        }
        userService.addUser(user);
        return "redirect:/login";
    }
}

