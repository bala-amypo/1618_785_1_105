package com.example.demo.util;

import com.example.demo.security.JwtUtil;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.JwtException;

public class ValidationUtil {

    private final JwtUtil jwtUtil;

    public ValidationUtil(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    public Claims validateTokenAndGetClaims(String token) {
        try {
            Jws<Claims> jws = jwtUtil.validateAndGetClaims(token);
            return jws.getBody();
        } catch (JwtException | IllegalArgumentException e) {
            throw new RuntimeException("Invalid JWT token", e);
        }
    }
}
