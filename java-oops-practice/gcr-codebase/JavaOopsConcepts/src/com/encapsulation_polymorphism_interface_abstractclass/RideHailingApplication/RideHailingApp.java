package com.encapsulation_polymorphism_interface_abstractclass.RideHailingApplication;

import java.util.ArrayList;
import java.util.List;

public class RideHailingApp {

    // Polymorphic method
    public static void calculateRideFare(Vehicle vehicle, double distance) {

        vehicle.getVehicleDetails();
        System.out.println("Distance: " + distance + " km");
        System.out.println("Total Fare: ₹" + vehicle.calculateFare(distance));

        if (vehicle instanceof GPS) {
            GPS gps = (GPS) vehicle;
            System.out.println("Current Location: " + gps.getCurrentLocation());
        }

        System.out.println("---------------------------");
    }

    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();

        Vehicle car = new Car("CAR101", "Amit", 15);
        Vehicle bike = new Bike("BIKE202", "Rohit", 10);
        Vehicle auto = new Auto("AUTO303", "Suresh", 12);

        ((GPS) car).updateLocation("City Center");
        ((GPS) bike).updateLocation("Railway Station");
        ((GPS) auto).updateLocation("Bus Stand");

        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(auto);

        double distance = 10;

        // Polymorphism
        for (Vehicle v : vehicles) {
            calculateRideFare(v, distance);
        }
    }
}
