package com.bytech.backend.repository.product;

import com.bytech.backend.model.product.Case;
import com.bytech.backend.model.product.CpuCooler;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;
import java.util.Optional;

public interface CpuCoolerRepository extends MongoRepository<CpuCooler, ObjectId> {
    @Query(value = "{'cpuSockets': ?0}")
    List<CpuCooler> findByCpuSockets(String cpuSockets);
}
