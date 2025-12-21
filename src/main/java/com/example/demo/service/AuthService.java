package com.example.demo.service;

import com.example.demo.model.Auth;
import java.util.List;

public interface AuthService {

    Auth save(Auth auth);

    List<Auth> getAll();

    Auth getById(Long id);

    void delete(Long id);
}
