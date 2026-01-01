package com.encapsulation_polymorphism_interface_abstractclass.VehicleRentalSystem;

public class Truck extends Vehicle implements Insurable {

    private String insurancePolicyNumber;

    public Truck(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicyNumber = policyNumber;
    }

    private String getPolicyNumber() {
        return insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return (rentalRate * days) + 2000; // extra load charge
    }

    @Override
    public double calculateInsurance() {
        return rentalRate * 0.25;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance (25%) applied | Policy No: " + getPolicyNumber();
    }
}
