package com.example.custom_validation.annotations;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ColorValidator.class)
public @interface ColorValidation {
    /**
     * Error message
      * @return String value
     */
    String message() ;

    /**
     * represents group of constraint
     * @return
     */
    Class<?>[] groups() default {};

    /**
     * represents additional information about annotation
     * @return
     */
     Class<? extends Payload>[] payload() default{};



}
