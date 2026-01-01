package com.encapsulation_polymorphism_interface_abstractclass.LibraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem {

    public static void main(String[] args) {

        List<LibraryItem> items = new ArrayList<>();

        LibraryItem book = new Book(1, "Java Programming", "Herbert Schildt");
        LibraryItem magazine = new Magazine(2, "Tech Monthly", "Editorial Team");
        LibraryItem dvd = new DVD(3, "Inception", "Christopher Nolan");

        items.add(book);
        items.add(magazine);
        items.add(dvd);

        // Polymorphism
        for (LibraryItem item : items) {
            item.getItemDetails();

            if (item instanceof Reservable) {
                Reservable r = (Reservable) item;
                System.out.println("Available: " + r.checkAvailability());
                r.reserveItem("Amit");
            }

            System.out.println("--------------------------");
        }
    }
}
