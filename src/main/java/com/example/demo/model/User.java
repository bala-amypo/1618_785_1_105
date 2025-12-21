// package com.example.demo.entity;


// import lombok.Data;
// import lombok.AllArgsConstructor;
// import lombok.NoArgsConstructor;
// import jakarta.persistence.Id;
// import jakarta.persistence.Column;
// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import java.time.LocalDateTime;
// @Data
// @AllArgsConstructor
// @NoArgsConstructor
// @Entity
// public class User{
//     @Id
//     @GeneratedValue(strategy=GenerationType.IDENTITY)
//     private Long id;
//     @Column(name="username" unique='true')
//     private String username;
//     @Column(name="email" unique='true')
//     private String email;
//     private String password;
//     private String role;
//     private LocalDateTime createdAt;

// }