package com.TrafficManager_Roundabout_Vehicle_Flow;

public class TrafficManager {
    public static void main(String[] args) {

        VehicleQueue waitingQueue = new VehicleQueue(3);
        Roundabout roundabout = new Roundabout();

        waitingQueue.enqueue(101);
        waitingQueue.enqueue(102);
        waitingQueue.enqueue(103);
        waitingQueue.enqueue(104); // Overflow

        int vehicle;
        vehicle = waitingQueue.dequeue();
        if (vehicle != -1) roundabout.addVehicle(vehicle);

        vehicle = waitingQueue.dequeue();
        if (vehicle != -1) roundabout.addVehicle(vehicle);

        roundabout.printRoundabout();

        roundabout.removeVehicle();
        roundabout.printRoundabout();

        waitingQueue.dequeue();
        waitingQueue.dequeue(); // Underflow
    }
}

