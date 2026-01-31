package com.Default_Methods_in_Interfaces.Payment_Gateway_Integration;

interface PaymentProcessor {

    void pay(double amount);

    // New feature added later
    default void refund(double amount) {
        System.out.println("Refunded ₹" + amount + " using standard process");
    }
}
