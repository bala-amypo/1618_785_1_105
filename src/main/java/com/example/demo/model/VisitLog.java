package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "visit_logs")
public class VisitLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String purpose;
    private boolean accessGranted;
    private boolean alertSent;

    private LocalDateTime checkInTime;
    private LocalDateTime checkOutTime;

    public VisitLog() {}

    // ---- Getters & Setters ----
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public boolean getAccessGranted() {
        return accessGranted;
    }

    public void setAccessGranted(boolean accessGranted) {
        this.accessGranted = accessGranted;
    }

    public boolean getAlertSent() {
        return alertSent;
    }

    public void setAlertSent(boolean alertSent) {
        this.alertSent = alertSent;
    }

    public LocalDateTime getCheckInTime() {
        return checkInTime;
    }

    public void setCheckInTime(LocalDateTime checkInTime) {
        this.checkInTime = checkInTime;
    }

    public LocalDateTime getCheckOutTime() {
        return checkOutTime;
    }

    public void setCheckOutTime(LocalDateTime checkOutTime) {
        this.checkOutTime = checkOutTime;
    }
}
