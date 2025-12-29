package com.constructors.level1;


public class TextBook {

    // Public variable
    public String ISBN;

    // Protected variable
    protected String title;

    // Private variable
    private String author;

    // Constructor
    TextBook(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Setter for author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter for author
    public String getAuthor() {
        return author;
    }
}

