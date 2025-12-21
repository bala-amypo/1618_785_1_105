package com.example.demo.service.impl;

import com.example.demo.model.Visitor;
import com.example.demo.repository.Visitorrepository;
import com.example.demo.service.VisitorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisitorServiceimpl implements VisitorService {

    @Autowired
    private Visitorrepository visitorrepository;

    @Override
    public Visitor createVisitor(Visitor visitor) {
        return visitorrepository.save(visitor);
    }

    @Override
    public Visitor getVisitor(Long id) {
        return visitorrepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Visitor not found"));
    }

    @Override
    public List<Visitor> getAllVisitors() {
        return visitorrepository.findAll();
    }  
}
