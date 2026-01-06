package Linked_List.Doubly_Linked_List.Library_Management_System;

public class LibraryManagementSystem {

    public static void main(String[] args) {

        LibraryDoublyLinkedList library = new LibraryDoublyLinkedList();

        library.addAtBeginning(1, "Java Basics", "Herbert Schildt", "Programming", true);
        library.addAtEnd(2, "Clean Code", "Robert Martin", "Software", true);
        library.addAtEnd(3, "Data Structures", "Seymour Lipschutz", "CS", false);
        library.addAtPosition(2, 4, "Python Guide", "Guido Rossum", "Programming", true);

        System.out.println("Library (Forward):");
        library.displayForward();

        System.out.println("\nLibrary (Reverse):");
        library.displayReverse();

        System.out.println("\nSearch by Author:");
        library.searchByAuthor("Robert Martin");

        System.out.println("\nUpdate Availability:");
        library.updateAvailability(3, true);

        System.out.println("\nRemove Book:");
        library.removeById(1);

        System.out.println("\nFinal Library:");
        library.displayForward();

        System.out.println("\nTotal Books: " + library.countBooks());
    }
}

