package com.example.demo.Repository;


import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.Model.usermodel;



public interface demorepo extends JpaRepository<usermodel, Integer>{
    
}