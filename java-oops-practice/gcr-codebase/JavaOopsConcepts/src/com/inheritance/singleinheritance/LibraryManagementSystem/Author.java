package com.inheritance.singleinheritance.LibraryManagementSystem;

class Author extends Book {
    String name;
    String bio;

    // Constructor
    Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);  // calling superclass constructor
        this.name = name;
        this.bio = bio;
    }

    // Overriding displayInfo method
    @Override
    void displayInfo() {
        super.displayInfo();  // call Book's displayInfo
        System.out.println("Author Name: " + name);
        System.out.println("Author Bio: " + bio);
    }
}

