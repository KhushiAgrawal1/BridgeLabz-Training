package com.design_patterns.Smart_University_Library_Management_System;

public class Faculty implements User {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public void showRole() {
        System.out.println(name + " is a Faculty.");
    }

    public void update(String message) {
        System.out.println(name + " notified: " + message);
    }
}

