package com.bytech.backend.api.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

@Getter
public class AddRamBody extends AddProductBody {

    @NotNull
    @NotBlank
    private String capacity;
    @NotNull
    @NotBlank
    private String type;
    @NotNull
    @NotBlank
    private Integer frequency;
    @NotNull
    @NotBlank
    private Double voltage;
    @NotNull
    @NotBlank
    private String delay;
    @NotNull
    @NotBlank
    private Byte numberOfModules;
}
