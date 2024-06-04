package com.bytech.backend.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@EqualsAndHashCode(callSuper = true)
@Data
@Document(collection = "CpuCooler")
public class CpuCooler extends Product{
    private String fanSpeed;
    private Integer fanDiameter;
    private Integer fans;
    private Integer height;
    private Integer width;
    private Integer depth;
    private Boolean rgb;
    private ArrayList<String> CpuSockets;

}
