package com.bytech.backend.api.model.product;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

import java.util.ArrayList;

@Getter
public class AddCaseBody extends AddProductBody{

    @NotNull
    @NotBlank
    private String caseType;
    @NotNull
    @NotBlank
    private Integer maxLengthOfGPU;
    @NotNull
    @NotBlank
    private Integer maxHeightOfCpuCooler;
    @NotNull
    @NotBlank
    private String color;
    @NotNull
    @NotBlank
    private Boolean rgb;
    @NotNull
    @NotBlank
    private Boolean window;
    @NotNull
    @NotBlank
    private Integer height;
    @NotNull
    @NotBlank
    private Integer width;
    @NotNull
    @NotBlank
    private Integer depth;
    @NotNull
    @NotBlank
    private ArrayList<String> compatibilities;
    @NotNull
    @NotBlank
    private Integer fans;
    @NotNull
    @NotBlank
    private Integer fansDiameter;
    @NotNull
    @NotBlank
    private Integer UsbPorts;

}
