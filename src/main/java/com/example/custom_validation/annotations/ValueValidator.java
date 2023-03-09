package com.example.custom_validation.annotations;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Arrays;

public class ValueValidator implements ConstraintValidator<ValueValidation, Integer> {
    Integer[] listOfIntegerValue;

    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext constraintValidatorContext) {
        listOfIntegerValue = new Integer[]{1, 2, 3};
        return Arrays.asList(this.listOfIntegerValue).contains(value);

    }
}
