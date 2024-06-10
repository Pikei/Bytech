package com.bytech.backend.api.model.product;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

import java.util.List;

@Getter
public class AddMotherboardBody extends AddProductBody {

    @NotNull
    @NotBlank
    private String chipset;
    @NotNull
    @NotBlank
    private String socket;
    @NotNull
    @NotBlank
    private String memoryStandard;
    @NotNull
    @NotBlank
    private Integer memorySlots;
    @NotNull
    @NotBlank
    private Integer memoryMaxCapacity;
    @NotNull
    @NotBlank
    private String memoryType;
    @NotNull
    @NotBlank
    private List<Integer> supportedMemoryFrequencies;
    @NotNull
    @NotBlank
    private String mbStandard;
    @NotNull
    @NotBlank
    private Integer width;
    @NotNull
    @NotBlank
    private Integer depth;
    @NotNull
    @NotBlank
    private Boolean wifi;
    @NotNull
    @NotBlank
    private Boolean bluetooth;
    @NotNull
    @NotBlank
    private Boolean audio;
    @NotNull
    @NotBlank
    private Integer m2Slots;
    @NotNull
    @NotBlank
    private Integer sataPorts;
    @NotNull
    @NotBlank
    private Integer usbPorts;
}
