package com.bytech.backend.api.controller;

import com.bytech.backend.api.model.user.LoginBody;
import com.bytech.backend.api.model.user.LoginResponse;
import com.bytech.backend.api.model.user.RegistrationBody;
import com.bytech.backend.exceptions.UserAlreadyExistsException;
import com.bytech.backend.model.User;
import com.bytech.backend.service.UserService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "http://localhost:4200")
public class AuthenticationController {
    private final UserService userService;

    public AuthenticationController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<Void> register(@Valid @RequestBody RegistrationBody registrationBody){
        try {
            userService.registerUser(registrationBody);
            return ResponseEntity.ok().build();
        } catch (UserAlreadyExistsException e) {
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
    }


    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@Valid @RequestBody LoginBody loginBody) {
        String token = userService.login(loginBody);
        if (token == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
        LoginResponse loginResponse = new LoginResponse();
        loginResponse.setToken(token);
        return ResponseEntity.ok(loginResponse);
    }

    @GetMapping("/profile")
    public User getLoggedInUserProfile(@AuthenticationPrincipal User user) {
        return user;
    }

    @PostMapping("/logout")
    public ResponseEntity<LoginResponse> logout() {
        LoginResponse loginResponse = new LoginResponse();
        loginResponse.setToken(null);
        return ResponseEntity.ok(loginResponse);
    }

    @GetMapping("/admin")
    public boolean isAdmin(@AuthenticationPrincipal User user) {
        return user.getRole().equals("ADMIN");
    }
}
