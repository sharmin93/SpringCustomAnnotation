package com.example.custom_validation.annotations;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.*;

@Documented
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ValueValidator.class)
public @interface ValueValidation {

    String message() default "value is not correct";

    int[] values() default {1,2,3};

    /**
     * represents group of constraint
     *
     * @return
     */
    Class<?>[] groups() default {};

    /**
     * represents additional information about annotation
     *
     * @return
     */
    Class<? extends Payload>[] payload() default {};
}
