package com.example.demo.controller;

import com.example.demo.model.Auth;
import com.example.demo.service.AuthService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping
    public Auth create(@RequestBody Auth auth) {
        return authService.save(auth);
    }

    @GetMapping
    public List<Auth> getAll() {
        return authService.getAll();
    }

    @GetMapping("/{id}")
    public Auth getById(@PathVariable Long id) {
        return authService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        authService.delete(id);
    }
}
