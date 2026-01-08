package com.ParkEase_Smart_Parking_Management_System;

public class Truck extends Vehicle {

    public Truck(String vehicleNumber) {
        super(vehicleNumber, 80);
    }

    @Override
    public double calculateCharges(int hours) {
        double charge = baseRate * hours;
        if (hours > 5) {
            charge += 200;
        }
        return charge;
    }
}

