package com.example.demo.controller;

import com.example.demo.model.AlertNotification;
import com.example.demo.service.AlertNotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/alerts")
public class AlertNotificationController {

    @Autowired
    private AlertNotificationService alertService;

    @PostMapping("/{visitLogId}")
    public AlertNotification send(@PathVariable Long visitLogId) {
        return alertService.sendAlert(visitLogId);
    }

    @GetMapping("/{id}")
    public AlertNotification get(@PathVariable Long id) {
        return alertService.getAlert(id);
    }

    @GetMapping
    public List<AlertNotification> getAll() {
        return alertService.getAllAlerts();
    }
}
