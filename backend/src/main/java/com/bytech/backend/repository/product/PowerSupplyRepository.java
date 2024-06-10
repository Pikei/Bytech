package com.bytech.backend.repository;

import com.bytech.backend.model.PowerSupply;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface PowerSupplyRepository extends MongoRepository<PowerSupply, ObjectId> {
    @Query(value = "{'power': {$gte: ?0}}")
    List<PowerSupply> findByPowerGreaterThanOrEqual(int power);

}
