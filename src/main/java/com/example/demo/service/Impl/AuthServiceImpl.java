package com.example.demo.service.Impl;

import com.example.demo.model.Auth;
import com.example.demo.repository.AuthRepository;
import com.example.demo.service.AuthService;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthServiceImpl implements AuthService {

    private final AuthRepository authRepository;

    public AuthServiceImpl(AuthRepository authRepository) {
        this.authRepository = authRepository;
    }

    @Override
    public Auth save(Auth auth) {
        return authRepository.save(auth);
    }

    @Override
    public List<Auth> getAll() {
        return authRepository.findAll();
    }

    @Override
    public Auth getById(Long id) {
        return authRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        authRepository.deleteById(id);
    }
}
