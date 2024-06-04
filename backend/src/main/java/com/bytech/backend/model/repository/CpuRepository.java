package com.bytech.backend.model.repository;

import com.bytech.backend.model.CPU;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CpuRepository extends MongoRepository<CPU, String> {
}
