package com.bytech.backend.api.model.product;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

@Getter
public class AddGpuBody extends AddProductBody {

    @NotNull
    @NotBlank
    private String chipsetProducer;
    @NotNull
    @NotBlank
    private String chipsetType;
    @NotNull
    @NotBlank
    private String memory;
    @NotNull
    @NotBlank
    private String bus;
    @NotNull
    @NotBlank
    private Integer cardLength;
    @NotNull
    @NotBlank
    private Integer recommendedPower;
    @NotNull
    @NotBlank
    private String coolingType;
}
