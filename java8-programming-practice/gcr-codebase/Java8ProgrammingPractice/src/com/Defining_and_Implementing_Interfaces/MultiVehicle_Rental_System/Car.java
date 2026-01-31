package com.Defining_and_Implementing_Interfaces.MultiVehicle_Rental_System;

class Car implements Vehicle {
    public void rent() {
        System.out.println("Car rented");
    }

    public void returnVehicle() {
        System.out.println("Car returned");
    }
}

