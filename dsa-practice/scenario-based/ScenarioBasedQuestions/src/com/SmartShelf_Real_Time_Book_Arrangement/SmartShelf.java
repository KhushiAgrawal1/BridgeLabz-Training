package com.SmartShelf_Real_Time_Book_Arrangement;

class SmartShelf {

    static class Book {
        String title;

        Book(String title) {
            this.title = title;
        }
    }

    // Insertion Sort by book title (Alphabetical)
    static void insertionSort(Book[] books) {
        for (int i = 1; i < books.length; i++) {
            Book key = books[i];
            int j = i - 1;

            while (j >= 0 && books[j].title.compareToIgnoreCase(key.title) > 0) {
                books[j + 1] = books[j];
                j--;
            }
            books[j + 1] = key;
        }
    }

    static void display(Book[] books) {
        for (Book b : books) {
            System.out.println(b.title);
        }
    }

    public static void main(String[] args) {
        Book[] books = {
            new Book("Java Basics"),
            new Book("Algorithms"),
            new Book("Data Structures"),
            new Book("Operating Systems")
        };

        insertionSort(books);
        display(books);
    }
}

