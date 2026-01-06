package Linked_List.Doubly_Linked_List.Library_Management_System;

public class BookNode {
	    int bookId;
	    String title;
	    String author;
	    String genre;
	    boolean available;

	    BookNode next;
	    BookNode prev;

	    BookNode(int bookId, String title, String author, String genre, boolean available) {
	        this.bookId = bookId;
	        this.title = title;
	        this.author = author;
	        this.genre = genre;
	        this.available = available;
	        this.next = null;
	        this.prev = null;
	    }
	}
