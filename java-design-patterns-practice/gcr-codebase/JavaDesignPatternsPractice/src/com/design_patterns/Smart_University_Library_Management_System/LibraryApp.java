package com.design_patterns.Smart_University_Library_Management_System;

public class LibraryApp {

    public static void main(String[] args) {

        // Singleton
        LibraryCatalog catalog = LibraryCatalog.getInstance();

        // Factory
        User student = UserFactory.createUser("student", "Alice");
        User faculty = UserFactory.createUser("faculty", "Dr. Bob");

        // Show roles
        student.showRole();
        faculty.showRole();

        // Observer registration
        catalog.addObserver(student);
        catalog.addObserver(faculty);

        // Builder
        Book book1 = new Book.BookBuilder("Design Patterns")
                .author("GoF")
                .edition("2nd")
                .genre("Software Engineering")
                .build();

        // Add book
        catalog.addBook(book1);
    }
}
