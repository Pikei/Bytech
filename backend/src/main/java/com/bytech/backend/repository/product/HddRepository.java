package com.bytech.backend.repository.product;

import com.bytech.backend.model.product.HDD;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface HddRepository extends MongoRepository<HDD, ObjectId> {

    @Query(value = "{'format': {$regex : ?0, $options: 'i'}}")
    List<HDD> findByFormat(String format);

    @Query(value = "{'interfaceType': {$regex : ?0, $options: 'i'}}")
    List<HDD> findByInterfaceType(String interfaceType);

    @Query(value = "{'capacity': {$regex : ?0, $options: 'i'}}")
    List<HDD> findByCapacity(String capacity);

    @Query(value = "{'rotationalSpeed': {$regex : ?0, $options: 'i'}}")
    List<HDD> findByRotationalSpeed(String rotationalSpeed);
}
