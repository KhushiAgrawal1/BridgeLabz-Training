package com.Default_Methods_in_Interfaces.Payment_Gateway_Integration;

class UPIProcessor implements PaymentProcessor {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
    }
}
