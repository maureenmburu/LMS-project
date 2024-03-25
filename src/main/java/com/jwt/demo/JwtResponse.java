package com.jwt.demo;

public class JwtResponse {
    private String jwt;

    public JwtResponse(String token) {
    }

    // Constructor
    public void AuthenticationResponse(String jwt) {
        this.jwt = jwt;
    }

    // Getter for jwt
    public String getJwt() {
        return jwt;
    }
}