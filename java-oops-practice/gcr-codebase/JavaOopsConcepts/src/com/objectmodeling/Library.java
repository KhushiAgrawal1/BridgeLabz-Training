package com.objectmodeling;

import java.util.ArrayList;

public class Library {
    String libraryName;
    ArrayList<Book> books = new ArrayList<>();

    Library(String libraryName) {
        this.libraryName = libraryName;
    }

    void addBook(Book book) {
        books.add(book);
    }

    void showBooks() {
        System.out.println("Library: " + libraryName);
        for (Book b : books) {
            b.showBook();
        }
    }
}
