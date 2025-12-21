package com.example.demo.service;

import com.example.demo.model.VisitLog;
import java.util.List;

public interface VisitLogService {

    VisitLog createVisitLog(VisitLog visitLog);

    List<VisitLog> getAllVisitLogs();

    VisitLog getVisitLogById(Long id);

    VisitLog updateVisitLog(Long id, VisitLog visitLog);

    void deleteVisitLog(Long id);
}
