package com.Defining_and_Implementing_Interfaces.MultiVehicle_Rental_System;

class Bike implements Vehicle {
    public void rent() {
        System.out.println("Bike rented");
    }

    public void returnVehicle() {
        System.out.println("Bike returned");
    }
}
