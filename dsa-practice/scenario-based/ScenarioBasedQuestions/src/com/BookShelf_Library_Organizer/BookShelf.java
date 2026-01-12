package com.BookShelf_Library_Organizer;

import java.util.*;

public class BookShelf {

    private HashMap<String, LinkedList<Book>> library;
    private HashSet<String> bookSet; // To avoid duplicate books
    private Scanner sc;

    // Constructor
    public BookShelf() {
        library = new HashMap<>();
        bookSet = new HashSet<>();
        sc = new Scanner(System.in);
    }

    // Method to add book
    public void addBook() {
        System.out.print("Enter genre: ");
        String genre = sc.nextLine();

        System.out.print("Enter book title: ");
        String title = sc.nextLine();

        System.out.print("Enter author name: ");
        String author = sc.nextLine();

        String key = title.toLowerCase() + "-" + author.toLowerCase();
        if (bookSet.contains(key)) {
            System.out.println("Book already exists: " + title);
            return;
        }

        Book book = new Book(title, author);
        library.putIfAbsent(genre, new LinkedList<>());
        library.get(genre).add(book);
        bookSet.add(key);

        System.out.println("Added book: " + book + " under genre: " + genre);
    }

    // Method to remove book
    public void removeBook() {
        System.out.print("Enter genre: ");
        String genre = sc.nextLine();

        System.out.print("Enter book title: ");
        String title = sc.nextLine();

        System.out.print("Enter author name: ");
        String author = sc.nextLine();

        if (!library.containsKey(genre)) {
            System.out.println("Genre not found: " + genre);
            return;
        }

        LinkedList<Book> books = library.get(genre);
        boolean removed = books.removeIf(b -> b.title.equalsIgnoreCase(title) && b.author.equalsIgnoreCase(author));

        if (removed) {
            bookSet.remove(title.toLowerCase() + "-" + author.toLowerCase());
            System.out.println("Removed book: " + title);
        } else {
            System.out.println("Book not found: " + title);
        }
    }

    // Method to display library
    public void displayLibrary() {
        if (library.isEmpty()) {
            System.out.println("Library is empty.");
            return;
        }

        System.out.println("\nLibrary Catalog:");
        for (String genre : library.keySet()) {
            System.out.println("Genre: " + genre);
            LinkedList<Book> books = library.get(genre);
            for (Book b : books) {
                System.out.println("  - " + b);
            }
        }
    }

    // User menu
    public void menu() {
        while (true) {
            System.out.println("\nLibrary Menu:");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Display Library");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1 -> addBook();
                case 2 -> removeBook();
                case 3 -> displayLibrary();
                case 4 -> {
                    System.out.println("Exiting... Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid option! Try again.");
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        BookShelf shelf = new BookShelf();
        shelf.menu();
    }
}


