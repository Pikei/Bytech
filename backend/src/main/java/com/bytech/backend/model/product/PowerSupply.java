package com.bytech.backend.model.product;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.mongodb.core.mapping.Document;

@EqualsAndHashCode(callSuper = true)
@Data
@Document(collection = "PowerSupply")
public class PowerSupply extends Product{
    private String certification;
    private String efficiency;
    private Integer power;
    private String modularity;
    private String standard;
    private Integer fanDiameter;
    private Integer height;
    private Integer width;
    private Integer depth;
}
