package com.jwt.demo;

public class JwtRequest {

    private String username;
    private String password;

    // Constructor
    public JwtRequest() {
        // Default constructor
    }

    // Constructor with parameters
    public JwtRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }
    // Getter for username
    public String getUsername() {
        return username;
    }

    // Setter for username
    public void setUsername(String username) {
        this.username = username;
    }

    // Getter for password
    public String getPassword() {
        return password;
    }

    // Setter for password
    public void setPassword(String password) {
        this.password = password;
    }
}

