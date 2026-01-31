package com.Default_Methods_in_Interfaces.Smart_Vehicle_Dashboard;

public class VehicleDashboard {
    public static void main(String[] args) {

        Vehicle v1 = new PetrolCar();
        Vehicle v2 = new ElectricCar();

        v1.displaySpeed();
        v1.displayBattery();   // default

        v2.displaySpeed();
        v2.displayBattery();   // overridden
    }
}
