package com.bytech.backend.repository;

import com.bytech.backend.model.CPU;
import com.mongodb.lang.NonNullApi;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;
import java.util.Optional;

public interface CpuRepository extends MongoRepository<CPU, ObjectId> {
    @Query(value = "{'model': {$regex : ?0, $options: 'i'}}")
    Optional<CPU> findByModel(String model);

    @Query(value = "{'producer': {$regex : ?0, $options: 'i'}}")
    List<CPU> findByProducer(String producer);

    @Query(value = "{'socket': {$regex : ?0, $options: 'i'}}")
    List<CPU> findBySocket(String socket);

    @Query(value = "{'line': {$regex : ?0, $options: 'i'}}")
    List<CPU> findByLine(String line);
}
