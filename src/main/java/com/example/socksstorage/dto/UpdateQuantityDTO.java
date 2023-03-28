package com.example.socksstorage.dto;

import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
public class UpdateQuantityDTO {
    @NotNull
    private String color;
    @NotNull
    @Min(0)
    @Max(100)
    private int cottonPart;
    @NotNull
    @Min(0)
    private int quantity;
}
