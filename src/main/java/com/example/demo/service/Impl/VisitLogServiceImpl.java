package com.example.demo.service.Impl;

import com.example.demo.entity.VisitLog;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.VisitLogRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.time.LocalDateTime;

@Service
public class VisitLogServiceImpl {

    @Autowired
    private VisitLogRepository visitLogRepository;

    public void checkInVisitor(Long visitId) {
        VisitLog visitLog = visitLogRepository.findById(visitId)
                .orElseThrow(() -> new ResourceNotFoundException("Visitor not found"));

        if (visitLog.isCheckedIn()) {
            throw new IllegalStateException("Visitor already checked in");
        }

        visitLog.setCheckedIn(true);
        visitLog.setCheckInTime(LocalDateTime.now());
        visitLogRepository.save(visitLog);
    }

    public void checkoutVisitor(Long visitId) {
        VisitLog visitLog = visitLogRepository.findById(visitId)
                .orElseThrow(() -> new ResourceNotFoundException("Visitor not found"));

        if (!visitLog.isCheckedIn()) {
            throw new IllegalStateException("Visitor not checked in");
        }

        if (visitLog.isCheckedOut()) {
            throw new IllegalStateException("Visitor already checked out");
        }

        visitLog.setCheckedOut(true);
        visitLog.setCheckoutTime(LocalDateTime.now());
        visitLogRepository.save(visitLog);
    }
}
