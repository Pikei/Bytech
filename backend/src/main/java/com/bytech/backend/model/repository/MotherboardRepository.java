package com.bytech.backend.model.repository;

import com.bytech.backend.model.Motherboard;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface MotherboardRepository extends MongoRepository<Motherboard, ObjectId> {
    @Query(value = "{'chipset' :  {$regex: ?0, $options: 'i'}}")
    List<Motherboard> findByChipset(String chipset);

    @Query(value = "{'socket' :  {$regex: ?0, $options: 'i'}}")
    List<Motherboard> findBySocket(String socket);

    @Query(value = "{'memoryStandard' :  {$regex: ?0, $options: 'i'}}")
    List<Motherboard> findByMemoryStandard(String memoryStandard);

    @Query(value = "{'memorySlots' :  {$regex: ?0, $options: 'i'}}")
    List<Motherboard> findByMemorySlots(Integer memorySlots);

    @Query(value = "{'memoryMaxCapacity' :  {$regex: ?0, $options: 'i'}}")
    List<Motherboard> findByMemoryMaxCapacity(Integer memoryMaxCapacity);


}
