package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Visitor;

@Repository

public interface Visitorrepository extends JpaRepository<Visitor,Long>{

}