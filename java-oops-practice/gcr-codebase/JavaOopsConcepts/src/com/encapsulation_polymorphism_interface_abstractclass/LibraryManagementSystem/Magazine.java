package com.encapsulation_polymorphism_interface_abstractclass.LibraryManagementSystem;

public class Magazine extends LibraryItem implements Reservable {

    public Magazine(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7; // 7 days
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (checkAvailability()) {
            borrowItem(borrowerName);
            System.out.println("Magazine reserved by " + borrowerName);
        } else {
            System.out.println("Magazine is currently unavailable");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isBorrowed();
    }
}
