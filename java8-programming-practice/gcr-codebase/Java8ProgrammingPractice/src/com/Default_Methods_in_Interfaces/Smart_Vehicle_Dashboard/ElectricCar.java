package com.Default_Methods_in_Interfaces.Smart_Vehicle_Dashboard;

class ElectricCar implements Vehicle {

    public void displaySpeed() {
        System.out.println("Speed: 70 km/h");
    }

    // Electric vehicle provides battery info
    public void displayBattery() {
        System.out.println("Battery: 85%");
    }
}

