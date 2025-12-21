package com.example.demo.service.Impl;

import com.example.demo.model.VisitLog;
import com.example.demo.repository.VisitLogRepository;
import com.example.demo.service.VisitLogService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VisitLogServiceImpl implements VisitLogService {

    private final VisitLogRepository visitLogRepository;

    public VisitLogServiceImpl(VisitLogRepository visitLogRepository) {
        this.visitLogRepository = visitLogRepository;
    }

    @Override
    public VisitLog createVisitLog(VisitLog visitLog) {
        if (visitLog.getAlertSent() == null) {
            visitLog.setAlertSent(false);
        }
        return visitLogRepository.save(visitLog);
    }

    @Override
    public List<VisitLog> getAllVisitLogs() {
        return visitLogRepository.findAll();
    }

    @Override
    public VisitLog getVisitLogById(Long id) {
        Optional<VisitLog> optional = visitLogRepository.findById(id);
        if (optional.isEmpty()) {
            throw new RuntimeException("VisitLog not found with id: " + id);
        }
        return optional.get();
    }

    @Override
    public VisitLog updateVisitLog(Long id, VisitLog visitLog) {

        VisitLog existing = getVisitLogById(id);

        if (visitLog.getPurpose() != null) {
            existing.setPurpose(visitLog.getPurpose());
        }

        if (visitLog.getAccessGranted() != null) {
            existing.setAccessGranted(visitLog.getAccessGranted());
        }

        if (visitLog.getAlertSent() != null) {
            existing.setAlertSent(visitLog.getAlertSent());
        }

        return visitLogRepository.save(existing);
    }

    @Override
    public void deleteVisitLog(Long id) {
        visitLogRepository.deleteById(id);
    }
}
