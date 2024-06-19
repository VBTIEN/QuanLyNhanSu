package com.example.QuanLyNhanSu.controllers;

import com.example.QuanLyNhanSu.models.NhanVien;
import com.example.QuanLyNhanSu.services.NhanVienService;
import com.example.QuanLyNhanSu.services.PhongBanService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/nhanviens")
public class NhanVienController {
  @Autowired
  private NhanVienService nhanVienService;
  
  @Autowired
  private PhongBanService phongBanService;
  
  /*Danh sách nhân viên*/
  @GetMapping
  public String showAllNhanVien(Model model) {
     List<NhanVien> nhanViens = nhanVienService.getAllNhanVien();
     model.addAttribute("nhanviens", nhanViens);
     return "nhanvien/list";
  }
  
  /*Thêm nhân viên*/
  @GetMapping("/add")
  public String addNhanVienForm(Model model) {
    model.addAttribute("nhanvien", new NhanVien());
    model.addAttribute("phongbans", phongBanService.getAllPhongBan());
    return "nhanvien/add";
  }
  
  @PostMapping("/add")
  public String addNhanVien(@Valid @ModelAttribute("nhanvien") NhanVien nhanvien, BindingResult bindingResult, Model model) {
    if (bindingResult.hasErrors()) {
      model.addAttribute("phongbans", phongBanService.getAllPhongBan());
      return "nhanvien/add";
    }
    nhanVienService.addNhanVien(nhanvien);
    return "redirect:/nhanviens";
  }
  
  /*Sửa nhân viên*/
  @GetMapping("/edit/{manv}")
  public String editNhanVienForm(@PathVariable("manv") String manv, Model model) {
    model.addAttribute("nhanvien", nhanVienService.getNhanVienByMa_NV(manv));
    model.addAttribute("phongbans", phongBanService.getAllPhongBan());
    return "nhanvien/edit";
  }
  
  @PostMapping("/edit/{manv}")
  public String editNhanVien(@ModelAttribute("nhanvien") NhanVien nhanvien) {
    nhanVienService.updateNhanVien(nhanvien);
    return "redirect:/nhanviens";
  }
  
  /*Xóa nhân viên*/
  @GetMapping("/delete/{manv}")
  public String deleteNhanVien(@PathVariable("manv") String manv) {
    NhanVien nhanvien = nhanVienService.getNhanVienByMa_NV(manv);
    nhanVienService.deleteNhanVien(nhanvien);
    return "redirect:/nhanviens";
  }
}
