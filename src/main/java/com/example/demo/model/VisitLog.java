package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.PrePersist;

import java.time.LocalDateTime;

@Entity
public class VisitLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDateTime checkInTime;

    private String purpose;

    @Column(nullable = false)
    private Boolean accessGranted;

    @Column(nullable = false)
    private Boolean alertSent;

    // Auto-generate check-in time
    @PrePersist
    public void onCreate() {
        this.checkInTime = LocalDateTime.now();
        if (this.alertSent == null) {
            this.alertSent = false;
        }
    }

    // ---------- Getters & Setters ----------

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getCheckInTime() {
        return checkInTime;
    }

    public void setCheckInTime(LocalDateTime checkInTime) {
        this.checkInTime = checkInTime;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public Boolean getAccessGranted() {
        return accessGranted;
    }

    public void setAccessGranted(Boolean accessGranted) {
        this.accessGranted = accessGranted;
    }

    public Boolean getAlertSent() {
        return alertSent;
    }

    public void setAlertSent(Boolean alertSent) {
        this.alertSent = alertSent;
    }
}
