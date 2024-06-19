package com.example.QuanLyNhanSu.models;

import com.example.QuanLyNhanSu.validators.annotations.ValidUsername;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name = "User")
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
  @Column(name = "username", length = 50, nullable = false, unique = true)
  @NotBlank(message = "Username is required")
  @Size(max = 50, message = "Username must be than 50 characters")
  @ValidUsername
  private String username;
  
  @Column(name = "password", length = 250, nullable = false)
  @NotBlank(message = "Password id required")
  private String password;
  
  @Column(name = "name", length = 50, nullable = false)
  @Size(max = 50, message = "Your name must be less than 50 characters")
  @NotBlank(message = "Your name is required")
  private String fullname;
  
  @Column(name = "email", length = 50)
  @NotBlank(message = "Email id required")
  @Size(max = 50, message = "Email must be less than 50 characters")
  private String email;
}
