package com.bytech.backend.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.mongodb.core.mapping.Document;

@EqualsAndHashCode(callSuper = true)
@Data
@Document(collection = "CPUs")
public class CPU extends Product {
    private String producer;
    private String line;
    private String model;
    private Integer cores;
    private String socket;
    private Double frequency;
    private Double maxFrequency;
    private Integer tdp;
}
