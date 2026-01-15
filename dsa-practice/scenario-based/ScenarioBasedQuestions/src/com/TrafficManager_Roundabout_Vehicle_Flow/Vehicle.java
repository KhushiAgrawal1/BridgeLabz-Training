package com.TrafficManager_Roundabout_Vehicle_Flow;

public class Vehicle {
    int vehicleId;
    Vehicle next;

    public Vehicle(int vehicleId) {
        this.vehicleId = vehicleId;
        this.next = null;
    }
}

