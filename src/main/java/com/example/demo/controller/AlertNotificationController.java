package com.example.demo.controller;

import com.example.demo.model.AlertNotification;
import com.example.demo.service.AlertNotificationService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RestController
@RequestMapping("/alerts")
public class AlertNotificationController {

    private final AlertNotificationService alertNotificationService;

    public AlertNotificationController(AlertNotificationService alertNotificationService) {
        this.alertNotificationService = alertNotificationService;
    }

    @PostMapping
    public AlertNotification createAlert(@RequestBody AlertNotification alertNotification) {
        return alertNotificationService.createAlert(alertNotification);
    }

    @GetMapping
    public List<AlertNotification> getAllAlerts() {
        return alertNotificationService.getAllAlerts();
    }

    @GetMapping("/{id}")
    public AlertNotification getAlertById(@PathVariable Long id) {
        return alertNotificationService.getAlertById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteAlert(@PathVariable Long id) {
        alertNotificationService.deleteAlert(id);
    }
}
