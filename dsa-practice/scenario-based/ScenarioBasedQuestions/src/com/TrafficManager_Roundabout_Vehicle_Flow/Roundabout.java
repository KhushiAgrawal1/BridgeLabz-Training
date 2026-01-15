package com.TrafficManager_Roundabout_Vehicle_Flow;

public class Roundabout {
    private Vehicle last;

    public Roundabout() {
        last = null;
    }

    public void addVehicle(int vehicleId) {
        Vehicle newVehicle = new Vehicle(vehicleId);

        if (last == null) {
            last = newVehicle;
            last.next = last;
        } else {
            newVehicle.next = last.next;
            last.next = newVehicle;
            last = newVehicle;
        }
        System.out.println("Vehicle " + vehicleId + " entered the roundabout.");
    }

    public void removeVehicle() {
        if (last == null) {
            System.out.println("Roundabout is empty. No vehicle to remove.");
            return;
        }

        Vehicle removed;
        if (last.next == last) {
            removed = last;
            last = null;
        } else {
            removed = last.next;
            last.next = removed.next;
        }
        System.out.println("Vehicle " + removed.vehicleId + " exited the roundabout.");
    }

    public void printRoundabout() {
        if (last == null) {
            System.out.println("Roundabout is empty.");
            return;
        }

        System.out.print("Roundabout vehicles: ");
        Vehicle temp = last.next;
        do {
            System.out.print(temp.vehicleId + " ");
            temp = temp.next;
        } while (temp != last.next);
        System.out.println();
    }
}
