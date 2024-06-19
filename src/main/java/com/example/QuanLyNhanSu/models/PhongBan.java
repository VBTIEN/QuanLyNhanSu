package com.example.QuanLyNhanSu.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "PhongBan")
public class PhongBan {
  @Id
  @Column(name = "Ma_Phong", length = 2, unique = true)
  @NotEmpty(message = "Ma_Phong must not be empty")
  @NotNull(message = "Ma_Phong is required")
  private String Ma_Phong;
  
  @Column(name = "Ten_Phong")
  @NotEmpty(message = "Ten_Phong must not be empty")
  @NotNull(message = "Ten_Phong is required")
  @Size(max = 30, min = 1, message = "Ten_Phong must be more than 30 characters")
  private String Ten_Phong;
  
  @OneToMany(mappedBy = "phongBan", cascade = CascadeType.ALL)
  private List<NhanVien> nhanViens;
}
