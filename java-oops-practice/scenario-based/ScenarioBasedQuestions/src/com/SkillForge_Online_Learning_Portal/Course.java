package com.SkillForge_Online_Learning_Portal;

import java.util.Arrays;

public class Course {
    private String title;
    private String instructor;
    private double rating;  // Encapsulated, controlled by setter
    private String[] modules;
    private final String[] reviews; // Read-only internal reviews

    // Constructor with default modules
    public Course(String title, String instructor) {
        this.title = title;
        this.instructor = instructor;
        this.modules = new String[] {"Introduction", "Basics", "Final Project"};
        this.rating = 0.0;
        this.reviews = new String[] {"Excellent content", "Well structured", "Engaging teaching"};
    }

    // Constructor with custom modules
    public Course(String title, String instructor, String[] modules) {
        this.title = title;
        this.instructor = instructor;
        this.modules = modules;
        this.rating = 0.0;
        this.reviews = new String[] {"Excellent content", "Well structured", "Engaging teaching"};
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getInstructor() {
        return instructor;
    }

    public double getRating() {
        return rating;
    }

    public String[] getModules() {
        return modules;
    }

    public String[] getReviews() {
        return reviews.clone(); // Read-only access
    }

    // Encapsulation: controlled rating logic
    public void setRating(double rating) {
        if(rating >= 0 && rating <= 5) {
            this.rating = rating;
        } else {
            System.out.println("Invalid rating. Must be between 0 and 5.");
        }
    }

    // Display course info
    public void displayCourse() {
        System.out.println("\nCourse: " + title);
        System.out.println("Instructor: " + instructor);
        System.out.println("Rating: " + rating);
        System.out.println("Modules: " + Arrays.toString(modules));
    }
}

