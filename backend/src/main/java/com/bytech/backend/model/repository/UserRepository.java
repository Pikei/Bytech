package com.bytech.backend.model.repository;

import com.bytech.backend.model.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User, ObjectId> {

    @Query(value = "{'email': {$regex : ?0, $options: 'i'}}")
    Optional<User> findByEmail(String email);

    @Query(value = "{'username' : {$regex : ?0, $options: 'i'}}")
    Optional<User> findByUsername(String username);


}
