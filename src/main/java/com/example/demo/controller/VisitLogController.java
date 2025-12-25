package com.example.demo.controller;

import com.example.demo.entity.VisitLog;
import com.example.demo.service.VisitLogService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/visitlog")
public class VisitLogController {

    private final VisitLogService service;

    public VisitLogController(VisitLogService service) {
        this.service = service;
    }

    @PostMapping("/checkin/{id}")
    public VisitLog checkIn(@PathVariable Long id) {
        return service.checkIn(id);
    }

    @PostMapping("/checkout/{id}")
    public VisitLog checkOut(@PathVariable Long id) {
        return service.checkOut(id);
    }

    @GetMapping
    public List<VisitLog> getAll() {
        return service.getAll();
    }
}
