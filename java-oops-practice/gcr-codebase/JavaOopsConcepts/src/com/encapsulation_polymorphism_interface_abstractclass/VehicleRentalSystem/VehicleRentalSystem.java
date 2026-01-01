package com.encapsulation_polymorphism_interface_abstractclass.VehicleRentalSystem;

import java.util.ArrayList;
import java.util.List;

public class VehicleRentalSystem {

    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("CAR101", 2000, "CAR-INS-001"));
        vehicles.add(new Bike("BIKE202", 800, "BIKE-INS-002"));
        vehicles.add(new Truck("TRUCK303", 5000, "TRUCK-INS-003"));

        int days = 3;

        // Polymorphism
        for (Vehicle v : vehicles) {

            System.out.println("Vehicle Type: " + v.getType());
            System.out.println("Vehicle Number: " + v.getVehicleNumber());
            System.out.println("Rental Cost for " + days + " days: ₹" + v.calculateRentalCost(days));

            if (v instanceof Insurable) {
                Insurable ins = (Insurable) v;
                System.out.println(ins.getInsuranceDetails());
                System.out.println("Insurance Cost: ₹" + ins.calculateInsurance());
            }

            System.out.println("-----------------------------");
        }
    }
}
