package com.bytech.backend.model;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

@Data
public abstract class Product {
    @Id
    private ObjectId id;
    private String name;
    private String producer;
    private String category;
    private String description;
    private Double price;

    public Product() {
    }

    public Product(String name, String category, String description) {
        this.name = name;
        this.category = category;
        this.description = description;
    }
}
