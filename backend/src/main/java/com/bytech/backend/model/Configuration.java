package com.bytech.backend.model;

import com.bytech.backend.model.product.*;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("configurations")
public class Configuration {
    @Id
    ObjectId configurationId;
    String name;
    String description;
    User user;
    Case pcCase;
    CPU cpu;
    CpuCooler cooler;
    GraphicsCard gpu;
    HDD hdd;
    Motherboard motherBoard;
    PowerSupply powerSupply;
    RAM ram;
    SSD ssd;

    //TODO: implement everything for configuration (api model, repository, service, controller)
}
