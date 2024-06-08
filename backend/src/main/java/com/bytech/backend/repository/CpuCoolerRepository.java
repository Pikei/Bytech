package com.bytech.backend.repository;

import com.bytech.backend.model.CpuCooler;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface CpuCoolerRepository extends MongoRepository<CpuCooler, ObjectId> {
    @Query(value = "{'cpuSockets': ?0}")
    List<CpuCooler> findByCpuSockets(String cpuSockets);
}
