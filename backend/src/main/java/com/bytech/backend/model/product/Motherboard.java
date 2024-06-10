package com.bytech.backend.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Document(collection = "Motherboard")
public class Motherboard extends Product {
    private String chipset;
    private String socket;
    private String memoryStandard;
    private Integer memorySlots;
    private Integer memoryMaxCapacity;
    private String memoryType;
    private List<Integer> supportedMemoryFrequencies;
    private String mbStandard;
    private Integer width;
    private Integer depth;
    private Boolean wifi;
    private Boolean bluetooth;
    private Boolean audio;
    private Integer m2Slots;
    private Integer sataPorts;
    private Integer usbPorts;
}
