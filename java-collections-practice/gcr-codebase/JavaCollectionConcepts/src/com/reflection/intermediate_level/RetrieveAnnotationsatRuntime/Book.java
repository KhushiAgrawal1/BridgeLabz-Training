package com.reflection.intermediate_level.RetrieveAnnotationsatRuntime;

@Author(name = "Khushi Agrawal")
public class Book {

    private String title;

    public Book(String title) {
        this.title = title;
    }

    public void displayTitle() {
        System.out.println("Book Title: " + title);
    }
}
