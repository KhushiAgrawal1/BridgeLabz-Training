package com.junit;

public class UserRegistration {

    public boolean registerUser(String username, String email, String password) {

        if (username == null || username.trim().isEmpty()) {
            throw new IllegalArgumentException("Username is invalid");
        }

        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Email is invalid");
        }

        if (password == null || password.length() < 8) {
            throw new IllegalArgumentException("Password is invalid");
        }

        // Assume user is registered successfully
        return true;
    }
}
