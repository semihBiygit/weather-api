package com.semihbiygit.weather.controller.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;


@Documented
@Constraint(validatedBy = {CityNameValidator.class})
@Target({METHOD, FIELD, PARAMETER})
@Retention(RUNTIME)
public @interface CityNameConstraint {
    String message() default "City name is not valid";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}
