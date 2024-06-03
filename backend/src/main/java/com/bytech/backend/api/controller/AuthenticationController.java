package com.bytech.backend.api.controller;

import com.bytech.backend.api.model.RegistrationBody;
import com.bytech.backend.exceptions.UserAlreadyExistsException;
import com.bytech.backend.service.UserService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {
    private final UserService userService;
//    private final UserRepository userRepository;

    public AuthenticationController(UserService userService) {
        this.userService = userService;
    }


//    public AuthenticationController(UserService userService, UserRepository userRepository) {
//        this.userService = userService;
//        this.userRepository = userRepository;
//    }

    @PostMapping("/register")
    public ResponseEntity register(@Valid @RequestBody RegistrationBody registrationBody){
        try {
            userService.registerUser(registrationBody);
            return ResponseEntity.ok().build();
        } catch (UserAlreadyExistsException e) {
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
//        User user = new User();
//        user.setEmail("test@email");
//        user.setUsername("test_username");
//        user.setPassword("test_password");
//        user.setFirstName("test_first_name");
//        user.setLastName("test_last_name");

//        if (userRepository.findByEmail(user.getEmail()) != null) {
//            throw new UserAlredyExistsException("Email " + user.getEmail() + " already exists");
//        }
//
//        if (userRepository.findByUsername(user.getUsername()) != null) {
//            throw new UserAlredyExistsException("Username " + user.getUsername() + " already exists");
//        }
//
//        userService.addUser(user);
    }
}
