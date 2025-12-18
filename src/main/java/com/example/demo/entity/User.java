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
        this.phone=phone;
        this.idProofNumber=idProofNumber;
        this.createdAt=createdAt;
    }
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public String getFullname(){
        return fullname;
    }
    public void setFullname(String fullname){
        this.fullname=fullname;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String Email){
        this.email=email;
    }
    public String getPhone(){
        return phone;
    }
    public void setPhone(String Phone){
        this.phone=phone;
    }
    public String getIdProofNumber(){
        return idProofNumber;
    }
    public void setIdProofNumber(String IdProofNumber){
        this.idproofnumber=idproofnumber;
    }

    }
    }

    }
    }
    }
    }
    }
    }
    }
    }

}