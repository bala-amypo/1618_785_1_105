package com.example.demo.service;

import com.example.demo.entity.VisitLog;
import java.util.List;

public interface VisitLogService {

    VisitLog checkIn(Long id);

    VisitLog checkOut(Long id);

    List<VisitLog> getAll();
}
