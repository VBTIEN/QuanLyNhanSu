package com.example.QuanLyNhanSu.services;

import com.example.QuanLyNhanSu.models.PhongBan;
import com.example.QuanLyNhanSu.repositories.IPhongBanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhongBanService {
  @Autowired
  private IPhongBanRepository phongBanRepository;
  
  public List<PhongBan> getAllPhongBan() {
    return phongBanRepository.findAll();
  }
}
