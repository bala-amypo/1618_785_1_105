package com.example.demo.auth;

public interface AuthService {

    String register(RegisterRequest request);

    String login(LoginRequest request);
}
