package com.example.custom_validation.annotations;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import javax.management.remote.JMXServerErrorException;
import java.util.Arrays;
import java.util.List;


public class ColorValidator implements ConstraintValidator<ColorValidation, String> {
    String message;


    @Override
    public boolean isValid(String colorName, ConstraintValidatorContext constraintValidatorContext) {
        List<String> colorList = Arrays.asList("Red, Green");
        if (colorList.contains(colorName)) {
            return colorList.contains(colorName);
        } else {

            return false;
        }

    }
}
