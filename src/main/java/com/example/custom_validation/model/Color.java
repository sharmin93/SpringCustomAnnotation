package com.example.custom_validation.model;

import com.example.custom_validation.annotations.ValueValidation;
import com.example.custom_validation.annotations.ValueValidator;
import com.example.custom_validation.annotations.ColorValidation;
import com.example.custom_validation.annotations.ColorValidator;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Color {
    @ColorValidation(groups = ColorValidator.class)
    private String colorName;
    private String colorCode;
    @ValueValidation(message = "Incorrect Value",groups = ValueValidator.class)
    private int colorValue;


}
