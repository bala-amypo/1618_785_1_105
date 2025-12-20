package com.example.demo.entity;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.time.LocalDateTime;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class VisitLog{
@Id
      private Long id;
      private visitor;
      private host;
      private LocalDateTime checkInTime;
      private LocalDateTime checkOutTime;
      private String purpose;
      private Boolean accessGranted;
      private Boolean alertSent;
}