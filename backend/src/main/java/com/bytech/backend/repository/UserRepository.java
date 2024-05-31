package com.bytech.backend.repository;

import com.bytech.backend.model.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User, ObjectId> {
    User findByEmail(String email);

    User findByUsername(String username);
}
