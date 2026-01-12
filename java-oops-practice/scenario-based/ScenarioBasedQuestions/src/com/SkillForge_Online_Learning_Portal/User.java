package com.SkillForge_Online_Learning_Portal;

public class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void displayUser() {
        System.out.println("Name: " + name + " | Email: " + email);
    }
}

