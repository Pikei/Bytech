package com.bytech.backend.model.product;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.mongodb.core.mapping.Document;

@EqualsAndHashCode(callSuper = true)
@Data
@Document(collection = "CPU")
public class CPU extends Product {
    private String line;
    private String model;
    private Integer cores;
    private String socket;
    private Double frequency;
    private Double maxFrequency;
    private Integer tdp;
}
