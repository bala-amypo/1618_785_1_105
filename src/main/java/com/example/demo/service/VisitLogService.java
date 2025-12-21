package com.example.demo.service;

import com.example.demo.model.VisitLog;
import java.util.List;

public interface VisitLogService {

    // Check-in a visitor
    VisitLog checkInVisitor(Long visitorId, Long hostId, String purpose);

    // Check-out a visitor (throw exception if not active)
    VisitLog checkOutVisitor(Long visitLogId);

    // Get all active visits
    List<VisitLog> getActiveVisits();

    // Get visit log by ID
    VisitLog getVisitLog(Long id);
}
