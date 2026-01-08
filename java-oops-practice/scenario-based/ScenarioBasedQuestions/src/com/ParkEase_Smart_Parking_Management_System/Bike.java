package com.ParkEase_Smart_Parking_Management_System;

public class Bike extends Vehicle {

    public Bike(String vehicleNumber) {
        super(vehicleNumber, 20);
    }

    @Override
    public double calculateCharges(int hours) {
        double charge = baseRate * hours;
        if (hours > 5) {
            charge += 50;
        }
        return charge;
    }
}

