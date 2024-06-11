package com.bytech.backend.repository;

import com.bytech.backend.model.User;
import com.bytech.backend.model.Configuration;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface ConfigurationRepository extends MongoRepository<Configuration, String> {
    @Query(value = "{'name' : {$regex : ?0, $options: 'i'}}")
    Configuration findByName(String name);

    @Query(value = "{'user' : ?0}")
    List<Configuration> findByUser(User user);
}
