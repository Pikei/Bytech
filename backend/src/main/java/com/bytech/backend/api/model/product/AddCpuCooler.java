package com.bytech.backend.api.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

import java.util.ArrayList;

@Getter
public class AddCpuCooler extends AddProductBody {

    @NotNull
    @NotBlank
    private String fanSpeed;
    @NotNull
    @NotBlank
    private Integer fanDiameter;
    @NotNull
    @NotBlank
    private Integer fans;
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
    private Boolean rgb;
    @NotNull
    @NotBlank
    private ArrayList<String> cpuSockets;
}
