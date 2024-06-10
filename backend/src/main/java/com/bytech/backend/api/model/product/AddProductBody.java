package com.bytech.backend.api.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

@Getter
public abstract class AddProductBody {
    @NotNull
    @NotBlank
    private String name;
    @NotNull
    @NotBlank
    private String producer;
    @NotNull
    @NotBlank
    private String category;
    @NotNull
    @NotBlank
    private String description;
    @NotNull
    @NotBlank
    private Double price;
}
