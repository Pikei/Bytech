package com.bytech.backend.model.product;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.mongodb.core.mapping.Document;

@EqualsAndHashCode(callSuper = true)
@Data
@Document(collection = "RAM")
public class RAM extends Product{
    private String capacity;
    private String type;
    private Integer frequency;
    private Double voltage;
    private String delay;
    private Byte numberOfModules;
}
