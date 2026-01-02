package Linked_List.Doubly_Linked_List.Movie_Management_System;

public class MovieDoublyLinkedList {

    MovieNode head;
    MovieNode tail;

    // Add at beginning
    void addAtBeginning(String title, String director, int year, double rating) {
        MovieNode newNode = new MovieNode(title, director, year, rating);

        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Add at end
    void addAtEnd(String title, String director, int year, double rating) {
        MovieNode newNode = new MovieNode(title, director, year, rating);

        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Add at specific position
    void addAtPosition(int pos, String title, String director, int year, double rating) {
        if (pos == 1) {
            addAtBeginning(title, director, year, rating);
            return;
        }

        MovieNode temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            addAtEnd(title, director, year, rating);
            return;
        }

        MovieNode newNode = new MovieNode(title, director, year, rating);
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;
    }

    // Remove by movie title
    void removeByTitle(String title) {
        MovieNode temp = head;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {

                if (temp == head) {
                    head = head.next;
                    if (head != null) head.prev = null;
                } else if (temp == tail) {
                    tail = tail.prev;
                    if (tail != null) tail.next = null;
                } else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie not found");
    }

    // Search by director
    void searchByDirector(String director) {
        MovieNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.director.equalsIgnoreCase(director)) {
                displayMovie(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No movies found for director");
        }
    }

    // Search by rating
    void searchByRating(double rating) {
        MovieNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.rating == rating) {
                displayMovie(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No movies found with this rating");
        }
    }

    // Update rating by title
    void updateRating(String title, double newRating) {
        MovieNode temp = head;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                temp.rating = newRating;
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie not found");
    }

    // Display forward
    void displayForward() {
        MovieNode temp = head;
        while (temp != null) {
            displayMovie(temp);
            temp = temp.next;
        }
    }

    // Display reverse
    void displayReverse() {
        MovieNode temp = tail;
        while (temp != null) {
            displayMovie(temp);
            temp = temp.prev;
        }
    }

    void displayMovie(MovieNode m) {
        System.out.println(
                "Title: " + m.title +
                ", Director: " + m.director +
                ", Year: " + m.year +
                ", Rating: " + m.rating
        );
    }

    // Main method
    public static void main(String[] args) {
        MovieDoublyLinkedList list = new MovieDoublyLinkedList();

        list.addAtBeginning("Inception", "Nolan", 2010, 8.8);
        list.addAtEnd("Interstellar", "Nolan", 2014, 8.6);
        list.addAtPosition(2, "Titanic", "Cameron", 1997, 7.9);

        System.out.println("Forward Display:");
        list.displayForward();

        System.out.println("\nReverse Display:");
        list.displayReverse();

        System.out.println("\nSearch by Director:");
        list.searchByDirector("Nolan");

        list.updateRating("Titanic", 8.1);
        list.removeByTitle("Interstellar");

        System.out.println("\nAfter Update & Deletion:");
        list.displayForward();
    }
}
