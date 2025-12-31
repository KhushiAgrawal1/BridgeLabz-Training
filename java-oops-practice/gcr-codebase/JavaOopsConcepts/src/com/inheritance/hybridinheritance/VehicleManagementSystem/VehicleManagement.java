package com.inheritance.hybridinheritance.VehicleManagementSystem;

public class VehicleManagement {
    public static void main(String[] args) {

        ElectricVehicle ev = new ElectricVehicle(150, "Tesla");
        PetrolVehicle pv = new PetrolVehicle(180, "Honda City");

        ev.displayDetails();
        ev.charge();

        pv.displayDetails();
        pv.refuel();
    }
}
