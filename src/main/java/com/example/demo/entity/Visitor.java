package com.example.demo.entity;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import jakarta.persistence.Id;
import jakarta.persistence,
@Data
@AllArgsConstructor
@NoArgsConstructor


public class Visitor{
    private Long id;
    private String fullname;
    private String email;
    private String phone;
    private String idProofNumber;
    private LocalDateTime createdAt;
}