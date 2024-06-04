package com.bytech.backend.model.repository;

import com.bytech.backend.model.SSD;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface SsdRepository extends MongoRepository<SSD, ObjectId> {
    @Query(value = "{'format': {$regex : ?0, $options: 'i'}}")
    List<SSD> findByFormat(String format);

    @Query(value = "{'interfaceType': {$regex : ?0, $options: 'i'}}")
    List<SSD> findByInterfaceType(String interfaceType);

    @Query(value = "{'capacity': {$regex : ?0, $options: 'i'}}")
    List<SSD> findByCapacity(String capacity);
}
