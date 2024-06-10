package com.bytech.backend.service;

import com.bytech.backend.api.model.user.LoginBody;
import com.bytech.backend.api.model.user.RegistrationBody;
import com.bytech.backend.exceptions.UserAlreadyExistsException;
import com.bytech.backend.model.User;
import com.bytech.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final EncryptionService encryptionService;
    private final JWTService jwtService;

    @Autowired
    public UserService(UserRepository userRepository, EncryptionService encryptionService, JWTService jwtService) {
        this.userRepository = userRepository;
        this.encryptionService = encryptionService;
        this.jwtService = jwtService;
    }

    public User addUser(User user) {
        return userRepository.save(user);
    }

    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    public void deleteUser(User user) {
        userRepository.deleteById(user.getId());
    }

    public void registerUser(RegistrationBody registrationBody) throws UserAlreadyExistsException {
        if(userRepository.findByUsername(registrationBody.getUsername()).isPresent()) {
            throw new UserAlreadyExistsException("Username " + registrationBody.getUsername() + " is already taken");
        }
        if (userRepository.findByEmail(registrationBody.getEmail()).isPresent()) {
            throw new UserAlreadyExistsException("Email " + registrationBody.getEmail() + " already exists");
        }
        User user = new User();
        user.setEmail(registrationBody.getEmail());
        user.setFirstName(registrationBody.getFirstName());
        user.setLastName(registrationBody.getLastName());
        user.setUsername(registrationBody.getUsername());
        user.setPassword(encryptionService.encryptPassword(registrationBody.getPassword()));
        user.setRole(registrationBody.getRole());
        userRepository.save(user);
    }

    public String login(LoginBody loginBody) {
        Optional<User> optionalUser = userRepository.findByUsername(loginBody.getUsername());
        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            if (encryptionService.checkPassword(loginBody.getPassword(), user.getPassword())) {
                return jwtService.generateToken(user);
            }
        }
        return null;
    }

    //TODO: add roles customer and admin for users to prevent adding/removing items from database without proper authorization

}
