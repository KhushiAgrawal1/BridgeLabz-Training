package com.Defining_and_Implementing_Interfaces.MultiVehicle_Rental_System;

class Bus implements Vehicle {
    public void rent() {
        System.out.println("Bus rented");
    }

    public void returnVehicle() {
        System.out.println("Bus returned");
    }
}
