package com.ParkEase_Smart_Parking_Management_System;

public class MainApp {
    public static void main(String[] args) {

        ParkingSlot slot =
                new ParkingSlot(101, "City Center", "Car");

        Vehicle car = new Car("MP09AB1234");

        ParkingService service = new ParkingService();

        service.assignSlot(slot, car);

        int hoursParked = 6;
        double charges = car.calculateCharges(hoursParked);

        System.out.println("Parking Charges: ₹" + charges);
        System.out.println(service.getBookingLog());

        service.releaseSlot(slot);
        System.out.println(service.getBookingLog());
    }
}

