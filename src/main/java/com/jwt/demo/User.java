package com.jwt.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "users")
public class User {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

private long id;
private String username;
private String password;


    public String getUsername() {
        return null;
    }

    public String getPassword() {
        return null;

    }
}
        