package com.bytech.backend.repository.product;

import com.bytech.backend.model.product.Case;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface CaseRepository extends MongoRepository<Case, ObjectId> {
    @Query(value = "{'name': {$regex : ?0, $options: 'i'}}")
    Optional<Case> findByName(String name);

}
