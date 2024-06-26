package com.bytech.backend.model.product;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.mongodb.core.mapping.Document;

@EqualsAndHashCode(callSuper = true)
@Data
@Document(collection = "GPU")
public class GraphicsCard extends Product {

    private String chipsetProducer;
    private String chipsetType;
    private String memory;
    private String bus;
    private Integer cardLength;
    private Integer recommendedPower;
    private String coolingType;

}
