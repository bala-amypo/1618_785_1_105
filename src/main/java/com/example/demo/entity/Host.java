package com.example.demo.entity;

public class Host{
    private Long id;
    private String hostName;
    private String fullname;
    private String email;
    private String department;
    private String phone;
    private LocalDateTime createdAt;

    public Host(Long id,String hostname,String fullname,String email,String department,String phone,String createdAt){
        this.id=id;
        this.hostname=hostname;
        this.fullname=fullname;
        this.email=email;
        this.department=department;
        this.phone=phone;
        this.createdAt=createdAt;
    }
     public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public String getHostname(){
        return hostname;
    }
    public void sethostname(String hostname){
        this.hostname=hostname;
    }
    public String getFullname(){
        return fullname;
    }
    public void setfullname(String fullname){
        this.fullname=fullname;
    } 
    public String getEmail(){
        return email;
    }
    public void setEmail(String Email){
        this.email=email;
    }
    public String getDepartment(){
        return department;
    }
    public void setDepartment(String Department){
        this.department=department;
    }
    public String getPhone(){
        return phone;
    }
    public void setPhone(String Phone){
        this.phone=phone;
    }
    public LocalDateTime getCreatedAt(){
        return createdAt;
        }
    public void setCreatedAt(LocalDateTime createdAt){
        this.createdAt=createdAt;
    }

}