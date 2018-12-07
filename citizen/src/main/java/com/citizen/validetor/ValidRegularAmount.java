package com.citizen.validetor;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = { RegularAmountValidator.class })
public @interface ValidRegularAmount {

    double weeklyAmount() default 57.90;

    String message() default "Please enter valid amount";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}