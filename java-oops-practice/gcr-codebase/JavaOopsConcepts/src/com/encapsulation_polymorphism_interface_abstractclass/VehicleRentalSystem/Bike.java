package com.encapsulation_polymorphism_interface_abstractclass.VehicleRentalSystem;

public class Bike extends Vehicle implements Insurable {

    private String insurancePolicyNumber;

    public Bike(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Bike", rentalRate);
        this.insurancePolicyNumber = policyNumber;
    }

    private String getPolicyNumber() {
        return insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    @Override
    public double calculateInsurance() {
        return rentalRate * 0.08;
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance (8%) applied | Policy No: " + getPolicyNumber();
    }
}
