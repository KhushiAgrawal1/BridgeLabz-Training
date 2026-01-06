package Linked_List.Doubly_Linked_List.Library_Management_System;

public class LibraryDoublyLinkedList {

    private BookNode head;
    private BookNode tail;

    public void addAtBeginning(int id, String title, String author, String genre, boolean available) {
        BookNode node = new BookNode(id, title, author, genre, available);

        if (head == null) {
            head = tail = node;
            return;
        }

        node.next = head;
        head.prev = node;
        head = node;
    }

    public void addAtEnd(int id, String title, String author, String genre, boolean available) {
        BookNode node = new BookNode(id, title, author, genre, available);

        if (tail == null) {
            head = tail = node;
            return;
        }

        tail.next = node;
        node.prev = tail;
        tail = node;
    }

    public void addAtPosition(int pos, int id, String title, String author, String genre, boolean available) {
        if (pos <= 1) {
            addAtBeginning(id, title, author, genre, available);
            return;
        }

        BookNode temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++)
            temp = temp.next;

        if (temp == null || temp.next == null) {
            addAtEnd(id, title, author, genre, available);
            return;
        }

        BookNode node = new BookNode(id, title, author, genre, available);
        node.next = temp.next;
        node.prev = temp;
        temp.next.prev = node;
        temp.next = node;
    }

    public void removeById(int id) {
        BookNode temp = head;

        while (temp != null && temp.bookId != id)
            temp = temp.next;

        if (temp == null) {
            System.out.println("Book not found");
            return;
        }

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
    }

    public void searchByTitle(String title) {
        BookNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                print(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found)
            System.out.println("Book not found");
    }

    public void searchByAuthor(String author) {
        BookNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.author.equalsIgnoreCase(author)) {
                print(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found)
            System.out.println("Book not found");
    }

    public void updateAvailability(int id, boolean status) {
        BookNode temp = head;

        while (temp != null) {
            if (temp.bookId == id) {
                temp.available = status;
                return;
            }
            temp = temp.next;
        }

        System.out.println("Book not found");
    }

    public void displayForward() {
        BookNode temp = head;
        while (temp != null) {
            print(temp);
            temp = temp.next;
        }
    }

    public void displayReverse() {
        BookNode temp = tail;
        while (temp != null) {
            print(temp);
            temp = temp.prev;
        }
    }

    public int countBooks() {
        int count = 0;
        BookNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    private void print(BookNode b) {
        System.out.println(
                b.bookId + " " +
                b.title + " " +
                b.author + " " +
                b.genre + " " +
                (b.available ? "Available" : "Issued")
        );
    }
}
