package com.design_patterns.Smart_University_Library_Management_System;

public class UserFactory {

    public static User createUser(String type, String name) {
        switch (type.toLowerCase()) {
            case "student":
                return new Student(name);
            case "faculty":
                return new Faculty(name);
            case "librarian":
                return new Librarian(name);
            default:
                throw new IllegalArgumentException("Unknown user type");
        }
    }
}
