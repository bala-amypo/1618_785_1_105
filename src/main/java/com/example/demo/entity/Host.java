package com.example.demo.entity;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Host{
    @Id
    @Entity
    private Long id;
    private String hostName;
    private String fullname;
    private String email;
    private String department;
    private String phone;
    private LocalDateTime createdAt;

    