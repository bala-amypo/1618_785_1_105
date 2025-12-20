package com.example.demo.entity;


import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Appointment{
    @Id
    private Long id;
    private visitor;
    private host;
    private LocalDate appointmentDate;
    private String purpose;
    private String status;
}