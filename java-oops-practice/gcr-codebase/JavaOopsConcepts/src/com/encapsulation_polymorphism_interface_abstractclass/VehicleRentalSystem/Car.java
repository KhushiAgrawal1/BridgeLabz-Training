package com.encapsulation_polymorphism_interface_abstractclass.VehicleRentalSystem;

public class Car extends Vehicle implements Insurable {

    private String insurancePolicyNumber;

    public Car(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        this.insurancePolicyNumber = policyNumber;
    }

    // Encapsulation: no direct access to policy number
    private String getPolicyNumber() {
        return insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    @Override
    public double calculateInsurance() {
        return rentalRate * 0.15;
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance (15%) applied | Policy No: " + getPolicyNumber();
    }
}
