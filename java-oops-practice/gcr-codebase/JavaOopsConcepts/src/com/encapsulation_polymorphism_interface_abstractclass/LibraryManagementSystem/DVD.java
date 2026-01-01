package com.encapsulation_polymorphism_interface_abstractclass.LibraryManagementSystem;

public class DVD extends LibraryItem implements Reservable {

    public DVD(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 3; // 3 days
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (checkAvailability()) {
            borrowItem(borrowerName);
            System.out.println("DVD reserved by " + borrowerName);
        } else {
            System.out.println("DVD is currently unavailable");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isBorrowed();
    }
}
