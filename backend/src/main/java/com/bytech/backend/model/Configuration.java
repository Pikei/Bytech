package com.bytech.backend.model;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("configurations")
public class Configuration {
    ObjectId configurationId;
    String name;
    String description;
    ObjectId userId;
    ObjectId caseId;
    ObjectId cpuId;
    ObjectId coolerId;
    ObjectId gpuId;
    ObjectId hddId;
    ObjectId motherBoardId;
    ObjectId powerSupplyId;
    ObjectId ramId;
    ObjectId ssdId;

    //TODO: implement everything for configuration (api model, repository, service, controller)
}
