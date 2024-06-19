package com.example.QuanLyNhanSu.services;

import com.example.QuanLyNhanSu.models.User;
import com.example.QuanLyNhanSu.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
  @Autowired
  private IUserRepository userRepository;
  
  public void save(User user) {
    userRepository.save(user);
  }
}
