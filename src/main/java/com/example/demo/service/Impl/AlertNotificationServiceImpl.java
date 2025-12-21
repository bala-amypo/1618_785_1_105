package com.example.demo.service.Impl;

import com.example.demo.model.AlertNotification;
import com.example.demo.repository.AlertNotificationRepository;
import com.example.demo.service.AlertNotificationService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlertNotificationServiceImpl implements AlertNotificationService {

    private final AlertNotificationRepository alertNotificationRepository;

    public AlertNotificationServiceImpl(AlertNotificationRepository alertNotificationRepository) {
        this.alertNotificationRepository = alertNotificationRepository;
    }

    @Override
    public AlertNotification createAlert(AlertNotification alertNotification) {
        return alertNotificationRepository.save(alertNotification);
    }

    @Override
    public List<AlertNotification> getAllAlerts() {
        return alertNotificationRepository.findAll();
    }

    @Override
    public AlertNotification getAlertById(Long id) {
        Optional<AlertNotification> optional = alertNotificationRepository.findById(id);
        if (optional.isEmpty()) {
            throw new RuntimeException("Alert not found with id: " + id);
        }
        return optional.get();
    }

    @Override
    public void deleteAlert(Long id) {
        alertNotificationRepository.deleteById(id);
    }
}
