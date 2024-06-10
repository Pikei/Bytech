package com.bytech.backend.model.product;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.mongodb.core.mapping.Document;

@EqualsAndHashCode(callSuper = true)
@Data
@Document(collection = "SSD")
public class SSD extends Product{
    private String format;
    private String interfaceType;
    private Integer capacity;
    private Integer readSpeed;
    private Integer writeSpeed;
}
