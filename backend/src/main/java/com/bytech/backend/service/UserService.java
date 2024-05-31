package com.bytech.backend.service;

import com.bytech.backend.model.User;
import com.bytech.backend.repository.UserRepository;
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
}
