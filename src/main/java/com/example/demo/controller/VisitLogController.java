package com.example.demo.controller;

import com.example.demo.model.VisitLog;
import com.example.demo.service.VisitLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/visitlogs")
public class VisitLogController {

    @Autowired
    private VisitLogService visitLogService;

    @PostMapping("/checkin/{visitorId}/{hostId}")
    public VisitLog checkIn(
            @PathVariable Long visitorId,
            @PathVariable Long hostId,
            @RequestParam String purpose) {

        return visitLogService.checkInVisitor(visitorId, hostId, purpose);
    }

    @PostMapping("/checkout/{id}")
    public VisitLog checkOut(@PathVariable Long id) {
        return visitLogService.checkOutVisitor(id);
    }

    @GetMapping("/{id}")
    public VisitLog get(@PathVariable Long id) {
        return visitLogService.getVisitLog(id);
    }

    @GetMapping("/active")
    public List<VisitLog> active() {
        return visitLogService.getActiveVisits();
    }
}
