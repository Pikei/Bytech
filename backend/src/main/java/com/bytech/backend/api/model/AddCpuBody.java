package com.bytech.backend.api.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

@Getter
public class AddCpuBody extends AddProductBody {

    @NotNull
    @NotBlank
    private String line;
    @NotNull
    @NotBlank
    private String model;
    @NotNull
    @NotBlank
    private Integer cores;
    @NotNull
    @NotBlank
    private String socket;
    @NotNull
    @NotBlank
    private Double frequency;
    @NotNull
    @NotBlank
    private Double maxFrequency;
    @NotNull
    @NotBlank
    private Integer tdp;
}
