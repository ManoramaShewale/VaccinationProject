package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.usermodel;
import com.example.demo.Repository.demorepo;

@Service
public class demoservice {
    @Autowired
    demorepo repo;

    public void add(usermodel u) {
        repo.save(u);
    }

    public List<usermodel> show() {
        return repo.findAll();
    }

}