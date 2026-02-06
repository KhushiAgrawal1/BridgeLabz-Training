package com.design_patterns.Smart_University_Library_Management_System;

public class Librarian implements User {
    private String name;

    public Librarian(String name) {
        this.name = name;
    }

    public void showRole() {
        System.out.println(name + " is a Librarian.");
    }

    public void update(String message) {
        System.out.println(name + " notified: " + message);
    }
}
