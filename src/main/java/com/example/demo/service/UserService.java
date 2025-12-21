package com.example.demo.service;

import com.example.demo.UserService.AuthRequest;
import com.example.demo.Userservice.RegisterRequest;

public interface UserService {

    
    void register(RegisterRequest request);

   
    String login(AuthRequest request);
}
