package com;

class SmartLibrary {

    // Insertion Sort for alphabetical order
    static void insertionSort(String[] books) {
        for (int i = 1; i < books.length; i++) {
            String currentBook = books[i];
            int j = i - 1;

            // Shift books that come after alphabetically
            while (j >= 0 && books[j].compareToIgnoreCase(currentBook) > 0) {
                books[j + 1] = books[j];
                j--;
            }

            // Insert book at correct position
            books[j + 1] = currentBook;
        }
    }

    public static void main(String[] args) {
        // Borrowed book titles
        String[] borrowedBooks = {
            "Java Programming",
            "Algorithms",
            "Data Structures",
            "Operating Systems",
            "Computer Networks"
        };

        insertionSort(borrowedBooks);

        System.out.println("Borrowed Books (Alphabetically Sorted):");
        for (String book : borrowedBooks) {
            System.out.println(book);
        }
    }
}

