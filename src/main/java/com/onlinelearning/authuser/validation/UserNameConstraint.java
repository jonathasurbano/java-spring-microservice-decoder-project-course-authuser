package com.onlinelearning.authuser.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = UserNameConstraintImpl.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface UserNameConstraint {
    String message() default "Invalid UserName";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
