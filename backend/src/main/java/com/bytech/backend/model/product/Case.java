package com.bytech.backend.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@EqualsAndHashCode(callSuper = true)
@Data
@Document(collection = "Case")
public class Case extends Product{

    private String caseType;
    private Integer maxLengthOfGPU;
    private Integer maxHeightOfCpuCooler;
    private String color;
    private Boolean rgb;
    private Boolean window;
    private Integer height;
    private Integer width;
    private Integer depth;
    private ArrayList<String> compatibilities;
    private Integer fans;
    private Integer fansDiameter;
    private Integer UsbPorts;

}
