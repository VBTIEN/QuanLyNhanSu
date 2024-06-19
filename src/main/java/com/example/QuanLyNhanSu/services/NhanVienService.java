package com.example.QuanLyNhanSu.services;

import com.example.QuanLyNhanSu.models.NhanVien;
import com.example.QuanLyNhanSu.repositories.INhanVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NhanVienService {
  @Autowired
  private INhanVienRepository nhanVienRepository;
  
  public List<NhanVien> getAllNhanVien() {
    return nhanVienRepository.findAll();
  }
  
  public NhanVien getNhanVienByMa_NV(String manv) {
    return nhanVienRepository.findByMa_NV(manv);
  }
  
  public void addNhanVien(NhanVien nhanVien) {
    nhanVienRepository.save(nhanVien);
  }
  
  public void deleteNhanVien(NhanVien nhanvien) {
    nhanVienRepository.delete(nhanvien);
  }
  
  public void updateNhanVien(NhanVien nhanVien) {
    nhanVienRepository.save(nhanVien);
  }
}
