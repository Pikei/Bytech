package com.bytech.backend.api.model;

import com.bytech.backend.model.User;
import com.bytech.backend.model.product.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import org.bson.types.ObjectId;

@Getter
public class ConfigurationBody {
    @NotNull
    @NotBlank
    private String name;
    private String description;
    @NotNull
    @NotBlank
    private ObjectId pcCaseID;
    @NotNull
    @NotBlank
    private ObjectId cpuID;
    @NotNull
    @NotBlank
    private ObjectId coolerID;
    @NotNull
    @NotBlank
    private ObjectId gpuID;
    @NotNull
    @NotBlank
    private ObjectId hddID;
    @NotNull
    @NotBlank
    private ObjectId motherBoardID;
    @NotNull
    @NotBlank
    private ObjectId powerSupplyID;
    @NotNull
    @NotBlank
    private ObjectId ramID;
    @NotNull
    @NotBlank
    private ObjectId ssdID;
}
