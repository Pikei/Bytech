package com.bytech.backend.model.repository;

import com.bytech.backend.model.Product;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface ProductRepository extends MongoRepository<Product, ObjectId> {
     @Query(value = "{'name': {$regex : ?0, $options: 'i'}}")
     Optional<Product> findByName(String name);

     @Query(value = "{'producer': {$regex : ?0, $options: 'i'}}")
     Optional<Product> findByProducer(String producer);

     @Query(value = "{'category': {$regex : ?0, $options: 'i'}}")
     Optional<Product> findByCategory(String category);

}
