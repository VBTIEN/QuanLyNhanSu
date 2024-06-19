package com.example.QuanLyNhanSu.validators;

import com.example.QuanLyNhanSu.models.PhongBan;
import com.example.QuanLyNhanSu.validators.annotations.ValidPhongBanMa_Phong;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidPhongBanMa_PhongValidator implements ConstraintValidator<ValidPhongBanMa_Phong, PhongBan> {
  @Override
  public boolean isValid(PhongBan phongBan, ConstraintValidatorContext context) {
    return phongBan != null && phongBan.getMa_Phong() != null;
  }
}
