package com.Vehicle_Rental_Application;

public class VehicleMain {
    public static void main(String[] args) {
        Rentable v = new Car("MP09AB1234");
        System.out.println("Rent: ₹" + v.calculateRent(4));
    }
}

