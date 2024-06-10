package com.bytech.backend.api.model.product;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

@Getter
public class AddHddBody extends AddProductBody {

    @NotNull
    @NotBlank
    private String format;
    @NotNull
    @NotBlank
    private String interfaceType;
    @NotNull
    @NotBlank
    private Integer capacity;
    @NotNull
    @NotBlank
    private Integer rotationalSpeed;
}
