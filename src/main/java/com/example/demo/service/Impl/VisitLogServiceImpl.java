package com.example.demo.service.Impl;

import com.example.demo.entity.VisitLog;
import com.example.demo.repository.VisitLogRepository;
import com.example.demo.service.VisitLogService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class VisitLogServiceImpl implements VisitLogService {

    private final VisitLogRepository repository;

    public VisitLogServiceImpl(VisitLogRepository repository) {
        this.repository = repository;
    }

    @Override
    public VisitLog checkIn(Long id) {
        VisitLog visitLog = repository.findById(id).orElseThrow();
        visitLog.setCheckedIn(true);
        visitLog.setCheckInTime(LocalDateTime.now());
        return repository.save(visitLog);
    }

    @Override
    public VisitLog checkOut(Long id) {
        VisitLog visitLog = repository.findById(id).orElseThrow();
        visitLog.setCheckedOut(true);
        visitLog.setCheckoutTime(LocalDateTime.now());
        return repository.save(visitLog);
    }

    @Override
    public List<VisitLog> getAll() {
        return repository.findAll();
    }
}
