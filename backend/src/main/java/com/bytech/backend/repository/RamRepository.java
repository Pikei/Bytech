package com.bytech.backend.repository;

import com.bytech.backend.model.RAM;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface RamRepository extends MongoRepository<RAM, ObjectId> {
    @Query("{'type': {$regex : ?0, $options: 'i'}}")
    List<RAM> findByType(String type);

    @Query("{'capacity': {$regex : ?0, $options: 'i'}}")
    List<RAM> findByCapacity(String capacity);

    @Query("{'frequency': {$regex : ?0, $options: 'i'}}")
    List<RAM> findByFrequency(String frequency);

    @Query("{'voltage': {$regex : ?0, $options: 'i'}}")
    List<RAM> findByVoltage(String voltage);

    @Query("{'delay': {$regex : ?0, $options: 'i'}}")
    List<RAM> findByDelay(String delay);

    @Query("{'numberOfModules': {$regex : ?0, $options: 'i'}}")
    List<RAM> findByNumberOfModules(String numberOfModules);
}
