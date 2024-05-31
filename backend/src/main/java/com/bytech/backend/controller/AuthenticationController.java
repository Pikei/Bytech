package com.bytech.backend.controller;

import com.bytech.backend.exceptions.UserAlredyExistsException;
import com.bytech.backend.model.User;
import com.bytech.backend.repository.UserRepository;
import com.bytech.backend.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {
    private final UserService userService;
    private final UserRepository userRepository;

    public AuthenticationController(UserService userService, UserRepository userRepository) {
        this.userService = userService;
        this.userRepository = userRepository;
    }

    @GetMapping("/register")
    public void register() {
        User user = new User();
        user.setEmail("test@email");
        user.setUsername("test_username");
        user.setPassword("test_password");
        user.setFirstName("test_first_name");
        user.setLastName("test_last_name");

        if (userRepository.findByEmail(user.getEmail()) != null) {
            throw new UserAlredyExistsException("Email " + user.getEmail() + " already exists");
        }

        if (userRepository.findByUsername(user.getUsername()) != null) {
            throw new UserAlredyExistsException("Username " + user.getUsername() + " already exists");
        }

        userService.addUser(user);
    }
}
