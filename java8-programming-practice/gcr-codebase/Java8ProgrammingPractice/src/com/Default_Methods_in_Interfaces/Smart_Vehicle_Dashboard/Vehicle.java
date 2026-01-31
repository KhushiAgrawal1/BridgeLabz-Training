package com.Default_Methods_in_Interfaces.Smart_Vehicle_Dashboard;

interface Vehicle {

    void displaySpeed();

    // New feature (optional for vehicles)
    default void displayBattery() {
        System.out.println("Battery info not available");
    }
}
