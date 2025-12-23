// package com.example.demo.model;

// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import jakarta.persistence.Column;
// import jakarta.persistence.PrePersist;

// import java.time.LocalDateTime;

// @Entity
// public class VisitLog {

//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Long id;

//     @Column(nullable = false)
//     private LocalDateTime checkInTime;

//     private String purpose;

//     @Column(nullable = false)
//     private Boolean accessGranted;

//     @Column(nullable = false)
//     private Boolean alertSent;

    
//     @PrePersist
//     public void onCreate() {
//         this.checkInTime = LocalDateTime.now();
//         if (this.alertSent == null) {
//             this.alertSent = false;
//         }
//     }

    
//     public Long getId() {
//         return id;
//     }

//     public void setId(Long id) {
//         this.id = id;
//     }

//     public LocalDateTime getCheckInTime() {
//         return checkInTime;
//     }

//     public void setCheckInTime(LocalDateTime checkInTime) {
//         this.checkInTime = checkInTime;
//     }

//     public String getPurpose() {
//         return purpose;
//     }

//     public void setPurpose(String purpose) {
//         this.purpose = purpose;
//     }

//     public Boolean getAccessGranted() {
//         return accessGranted;
//     }

//     public void setAccessGranted(Boolean accessGranted) {
//         this.accessGranted = accessGranted;
//     }

//     public Boolean getAlertSent() {
//         return alertSent;
//     }

//     public void setAlertSent(Boolean alertSent) {
//         this.alertSent = alertSent;
//     }
// }


package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "visitors")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Visitor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Full name is required")
    @Column(nullable = false)
    private String fullName;

    @Email(message = "Invalid email format")
    @Column(nullable = true, unique = false)
    private String email;

    @NotBlank(message = "Phone number is required")
    @Column(nullable = false)
    private String phone;

    @NotBlank(message = "ID proof number is required")
    @Column(nullable = false)
    private String idProofNumber;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;


    @OneToMany(mappedBy = "visitor", cascade = CascadeType.ALL)
    private List<Appointment> appointments;

    @OneToMany(mappedBy = "visitor", cascade = CascadeType.ALL)
    private List<VisitLog> visitLogs;

    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
    }
}
