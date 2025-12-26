package com.example.demo.util;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.JwtException;

import com.example.demo.security.JwtUtil;

public class ValidationUtil {

    private final JwtUtil jwtUtil;

    public ValidationUtil(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    public Claims validateTokenAndGetClaims(String token) {
        try {
            Jws<Claims> claimsJws = jwtUtil.validateAndGetClaims(token);
            return claimsJws.getBody();
        } catch (JwtException | IllegalArgumentException e) {
            throw new RuntimeException("Invalid JWT token", e);
        }
    }
}
