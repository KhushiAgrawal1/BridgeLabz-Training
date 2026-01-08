package com.ParkEase_Smart_Parking_Management_System;

public class Car extends Vehicle {

    public Car(String vehicleNumber) {
        super(vehicleNumber, 50);
    }

    @Override
    public double calculateCharges(int hours) {
        double charge = baseRate * hours;
        if (hours > 5) {
            charge += 100; // penalty
        }
        return charge;
    }
}

