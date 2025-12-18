package com.example.demo.entity;

public class User{
    private Long id;
    private String fullname;
    private String email;
    private String phone;
    private String idProofNumber;
    private LocalDateTime createdAt;

    public User(Long id,String fullname,String email,String phone,String idProofNumber,String createdAt){
        this.id=id;
        this.fullname=fullname;
        this.email=email;
        
    }

}