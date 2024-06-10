package com.bytech.backend.api.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

@Getter
public class AddPowerSupplyBody extends AddProductBody {

    @NotNull
    @NotBlank
    private String certification;
    @NotNull
    @NotBlank
    private String efficiency;
    @NotNull
    @NotBlank
    private Integer power;
    @NotNull
    @NotBlank
    private String modularity;
    @NotNull
    @NotBlank
    private String standard;
    @NotNull
    @NotBlank
    private Integer fanDiameter;
    @NotNull
    @NotBlank
    private Integer height;
    @NotNull
    @NotBlank
    private Integer width;
    @NotNull
    @NotBlank
    private Integer depth;
}
