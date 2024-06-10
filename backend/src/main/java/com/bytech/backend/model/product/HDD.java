package com.bytech.backend.model.product;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.mongodb.core.mapping.Document;

@EqualsAndHashCode(callSuper = true)
@Data
@Document(collection = "HDD")
public class HDD extends Product{
    private String format;
    private String interfaceType;
    private Integer capacity;
    private Integer rotationalSpeed;
}
