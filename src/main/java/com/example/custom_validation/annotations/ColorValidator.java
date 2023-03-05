package com.example.custom_validation.annotations;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Arrays;
import java.util.List;

public class ColorValidator implements ConstraintValidator<ColorValidation, String> {
    private String msg;

    @Override
    public void initialize(ColorValidation constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
        msg = constraintAnnotation.message();
    }

    @Override
    public boolean isValid(String colorName, ConstraintValidatorContext constraintValidatorContext) {
        List<String> colorList = Arrays.asList("Red, Green");

        return colorList.contains(colorName);
    }
}
