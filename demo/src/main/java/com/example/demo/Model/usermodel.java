package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class usermodel {
  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


   
    private String userId;
    private String idType;
    private String name;
    private String contactNumber;
    private String vaccineName;

    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getIdType() {
        return idType;
    }
    public void setIdType(String idType) {
        this.idType = idType;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getContactNumber() {
        return contactNumber;
    }
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
    public String getVaccineName() {
        return vaccineName;
    }
    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }
    @Override
    public String toString() {
        return "user [id=" + id + ", userId=" + userId + ", idType=" + idType + ", name=" + name + ", contactNumber="
                + contactNumber + ", vaccineName=" + vaccineName + "]";
    }

    
  
    

}