package com.inheritance.singleinheritance.LibraryManagementSystem;

public class LibraryManagement {
    public static void main(String[] args) {
        Author book1 = new Author(
                "Java Programming",
                2022,
                "James Gosling",
                "Creator of the Java programming language"
        );

        book1.displayInfo();
    }
}

