package com.example.QuanLyNhanSu.models;

import com.example.QuanLyNhanSu.validators.annotations.ValidPhongBanMa_Phong;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name = "NhanVien")
public class NhanVien {
  @Id
  @Column(name = "Ma_NV", length = 3, unique = true)
  @NotEmpty(message = "Ma_NV must not be empty")
  @NotNull(message = "Ma_NV is required")
  private String Ma_NV;
  
  @Column(name = "Ten_NV")
  @NotEmpty(message = "Ten_NV must not be empty")
  @NotNull(message = "Ten_NV is required")
  @Size(max = 100, min = 1, message = "Ten_NV must be more than 100 characters")
  private String Ten_NV;
  
  @Column(name = "Phai")
  @Size(max = 3, min = 2)
  @NotEmpty(message = "Phai must not be empty")
  private String Phai;
  
  @Column(name = "Noi_Sinh")
  @Size(max = 200, min = 1, message = "Noi_Sinh must be more than 100 characters")
  @NotEmpty(message = "Noi_Sinh must not be empty")
  private String Noi_Sinh;
  
  @Column(name = "Luong")
  @NotNull(message = "Luong is required")
  private Integer Luong;
  
  @ManyToOne
  @JoinColumn(name = "PhongBan_Ma_Phong", referencedColumnName = "Ma_Phong")
  @ValidPhongBanMa_Phong
  private PhongBan phongBan;
}
