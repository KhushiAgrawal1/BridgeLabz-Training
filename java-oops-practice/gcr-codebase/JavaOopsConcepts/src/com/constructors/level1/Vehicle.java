package com.constructors.level1;

class Vehicle {

    // Instance variables (unique for each vehicle)
    String ownerName;
    String vehicleType;

    // Class variable (common for all vehicles)
    static double registrationFee = 1500.0;

    // Constructor
    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method
    void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: ₹" + registrationFee);
    }

    // Class (static) method
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    // Main method
    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("Khushi Agrawal", "Two Wheeler");
        Vehicle v2 = new Vehicle("Amit Sharma", "Four Wheeler");

        v1.displayVehicleDetails();
        System.out.println();

        v2.displayVehicleDetails();
        System.out.println();

        // Update registration fee for all vehicles
        Vehicle.updateRegistrationFee(2000.0);

        System.out.println("After Updating Registration Fee:\n");

        v1.displayVehicleDetails();
        System.out.println();

        v2.displayVehicleDetails();
    }
}

