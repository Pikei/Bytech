package com.bytech.backend.api.controller;

import com.bytech.backend.api.model.LoginBody;
import com.bytech.backend.api.model.LoginResponse;
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

    @PostMapping("/register")
    public ResponseEntity register(@Valid @RequestBody RegistrationBody registrationBody){
        try {
            userService.registerUser(registrationBody);
            return ResponseEntity.ok().build();
        } catch (UserAlreadyExistsException e) {
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
    }


    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@Valid @RequestBody LoginBody loginBody) {
        String token = userService.Login(loginBody);
        if (token == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
        LoginResponse loginResponse = new LoginResponse();
        loginResponse.setToken(token);
        return ResponseEntity.ok(loginResponse);
    }
}
