package com.example.demo.entity;





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
      private
}