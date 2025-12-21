package com.example.demo.controller;

import com.example.demo.model.Visitor;
import com.example.demo.service.VisitorService;
import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/visitors")
@Tag(name = "Visitor Controller", description = "APIs for managing visitors")
public class VisitorController {

    @Autowired
    private VisitorService visitorService;

    // POST /api/visitors - create visitor
    @PostMapping
    public Visitor createVisitor(@RequestBody Visitor visitor) {
        return visitorService.createVisitor(visitor);
    }

    // GET /api/visitors - list visitors
    @GetMapping
    public List<Visitor> getAllVisitors() {
        return visitorService.getAllVisitors();
    }

    // GET /api/visitors/{id} - get visitor by id
    @GetMapping("/{id}")
    public Visitor getVisitor(@PathVariable Long id) {
        return visitorService.getVisitor(id);
    }
}
