package com.bytech.backend.model.repository;

import com.bytech.backend.model.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface UserRepository extends MongoRepository<User, ObjectId> {

    @Query("{'email' : ?0}")
    User findByEmail(String email);

    @Query("{'username' : ?0}")
    User findByUsername(String username);


}
