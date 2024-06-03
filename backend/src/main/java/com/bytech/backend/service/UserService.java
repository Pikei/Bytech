package com.bytech.backend.service;

import com.bytech.backend.api.model.RegistrationBody;
import com.bytech.backend.exceptions.UserAlreadyExistsException;
import com.bytech.backend.model.User;
import com.bytech.backend.model.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
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

    public User findUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public User registerUser(RegistrationBody registrationBody) throws UserAlreadyExistsException {
        if(userRepository.findByUsername(registrationBody.getUsername()) != null) {
            throw new UserAlreadyExistsException("Username " + registrationBody.getUsername() + " is already taken");
        }
        if (userRepository.findByEmail(registrationBody.getEmail()) != null) {
            throw new UserAlreadyExistsException("Email " + registrationBody.getEmail() + " already exists");
        }
        User user = new User();
        user.setEmail(registrationBody.getEmail());
        user.setUsername(registrationBody.getUsername());
        user.setPassword(registrationBody.getPassword());
        user.setFirstName(registrationBody.getFirstName());
        user.setLastName(registrationBody.getLastName());
        return userRepository.save(user);
    }
}
