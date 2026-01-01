package com.encapsulation_polymorphism_interface_abstractclass.LibraryManagementSystem;

public interface Reservable {

    void reserveItem(String borrowerName);

    boolean checkAvailability();
}
