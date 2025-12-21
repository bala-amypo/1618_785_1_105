package com.example.demo.service;

import com.example.demo.model.Visitor;
import java.util.List;

public interface VisitorService {

    // Create a new visitor
    Visitor createVisitor(Visitor visitor);

    // Get visitor by ID (throw exception if not found)
    Visitor getVisitor(Long id);

    // Get all visitors
    List<Visitor> getAllVisitors();
}
