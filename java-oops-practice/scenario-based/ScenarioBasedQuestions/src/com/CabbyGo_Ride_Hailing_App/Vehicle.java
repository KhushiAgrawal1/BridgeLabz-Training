package com.CabbyGo_Ride_Hailing_App;

public class Vehicle {
    protected String vehicleNumber;
    protected int capacity;
    protected String type;

    public Vehicle(String vehicleNumber, int capacity, String type) {
        this.vehicleNumber = vehicleNumber;
        this.capacity = capacity;
        this.type = type;
    }

    public void displayVehicle() {
        System.out.println(type + " - " + vehicleNumber);
    }
}

