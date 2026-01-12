package com.SkillForge_Online_Learning_Portal;

public class Main {
    public static void main(String[] args) {
        // Create instructor
        Instructor alice = new Instructor("Alice", "alice@skillforge.com");

        // Instructor creates a course
        String[] modules = {"Intro to Java", "OOP Basics", "Advanced Java", "Project"};
        Course javaCourse = alice.createCourse("Java Programming", modules);
        javaCourse.setRating(4.8);

        // Create student
        Student bob = new Student("Bob", "bob@student.com");

        // Student enrolls in course
        bob.enrollCourse(javaCourse);

        // Complete modules
        bob.completeModule();
        bob.completeModule();
        bob.completeModule();
        bob.completeModule(); // Complete all modules

        // Display course info
        javaCourse.displayCourse();

        // Generate certificates
        bob.generateCertificate();
        alice.generateCertificate();

        // Try to access reviews (read-only)
        System.out.println("\nCourse Reviews: ");
        for(String review : javaCourse.getReviews()) {
            System.out.println("- " + review);
        }
    }
}

