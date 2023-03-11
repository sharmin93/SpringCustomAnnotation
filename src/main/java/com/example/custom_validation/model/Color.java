package com.example.custom_validation.model;

import com.example.custom_validation.annotations.ValueValidation;
import com.example.custom_validation.annotations.ValueValidator;
import com.example.custom_validation.annotations.ColorValidation;
import com.example.custom_validation.annotations.ColorValidator;
import com.example.custom_validation.groups.ColorGroup;
import com.example.custom_validation.groups.ValueGroup;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Color {
    @ColorValidation(message = "Invalid color.",groups = ColorGroup.class)
    private String colorName;
    @ColorValidation(message = "invalid color2")
    private String colorName2;
    private String colorCode;
    @ValueValidation(message = "Incorrect Value",groups = ValueGroup.class)
    private int colorValue;


}
