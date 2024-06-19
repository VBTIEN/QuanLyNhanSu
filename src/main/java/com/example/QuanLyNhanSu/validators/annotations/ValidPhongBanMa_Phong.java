package com.example.QuanLyNhanSu.validators.annotations;

import com.example.QuanLyNhanSu.validators.ValidPhongBanMa_PhongValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({TYPE, FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = ValidPhongBanMa_PhongValidator.class)
@Documented
public @interface ValidPhongBanMa_Phong {
  String message() default "Invalid PhongBan Ma_Phong";
  Class<?>[] groups() default {};
  Class<? extends Payload>[] payload() default {};
}
