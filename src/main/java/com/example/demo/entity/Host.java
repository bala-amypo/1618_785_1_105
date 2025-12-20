package com.example.demo.entity;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
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
    @Column(name="email" unique='true')
    private String email;
    private String department;
    private String phone;
    private LocalDateTime createdAt;

    }