package com.encapsulation_polymorphism_interface_abstractclass.LibraryManagementSystem;

public abstract class LibraryItem {

    private int itemId;
    private String title;
    private String author;

    // Sensitive borrower data (encapsulated)
    private String borrowerName;
    private boolean isBorrowed;

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    // Encapsulation
    public int getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    protected void borrowItem(String borrowerName) {
        if (!isBorrowed) {
            this.borrowerName = borrowerName;
            this.isBorrowed = true;
        }
    }

    protected void returnItem() {
        this.borrowerName = null;
        this.isBorrowed = false;
    }

    protected boolean isBorrowed() {
        return isBorrowed;
    }

    // Abstract method
    public abstract int getLoanDuration();

    // Concrete method
    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Loan Duration: " + getLoanDuration() + " days");
    }
}
