package com.example.demo.controller;

import com.example.demo.model.VisitLog;
import com.example.demo.service.VisitLogService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RestController
@RequestMapping("/visitlogs")
public class VisitLogController {

    private final VisitLogService visitLogService;

    public VisitLogController(VisitLogService visitLogService) {
        this.visitLogService = visitLogService;
    }

    @PostMapping
    public VisitLog createVisitLog(@RequestBody VisitLog visitLog) {
        return visitLogService.createVisitLog(visitLog);
    }

    @GetMapping
    public List<VisitLog> getAllVisitLogs() {
        return visitLogService.getAllVisitLogs();
    }

    @GetMapping("/{id}")
    public VisitLog getVisitLogById(@PathVariable Long id) {
        return visitLogService.getVisitLogById(id);
    }

    @PutMapping("/{id}")
    public VisitLog updateVisitLog(
            @PathVariable Long id,
            @RequestBody VisitLog visitLog) {
        return visitLogService.updateVisitLog(id, visitLog);
    }

    @DeleteMapping("/{id}")
    public void deleteVisitLog(@PathVariable Long id) {
        visitLogService.deleteVisitLog(id);
    }
}
