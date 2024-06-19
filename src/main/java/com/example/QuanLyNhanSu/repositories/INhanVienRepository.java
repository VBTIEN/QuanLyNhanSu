package com.example.QuanLyNhanSu.repositories;

import com.example.QuanLyNhanSu.models.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface INhanVienRepository extends JpaRepository<NhanVien, String> {
  @Query("SELECT u FROM NhanVien u WHERE u.Ma_NV = ?1")
  NhanVien findByMa_NV(String Ma_NV);
}
