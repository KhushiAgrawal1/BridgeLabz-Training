package com.BookShelf_Library_Organizer;

public class Book {
    String title;
    String author;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // To display book info
    @Override
    public String toString() {
        return "\"" + title + "\" by " + author;
    }
}


