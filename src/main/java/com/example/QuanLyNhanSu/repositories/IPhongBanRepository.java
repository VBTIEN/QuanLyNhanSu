package com.example.QuanLyNhanSu.repositories;

import com.example.QuanLyNhanSu.models.PhongBan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPhongBanRepository extends JpaRepository<PhongBan, String> {
}
