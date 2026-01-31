package com.Default_Methods_in_Interfaces.Payment_Gateway_Integration;

class WalletProcessor implements PaymentProcessor {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Wallet");
    }

    // Override default refund
    public void refund(double amount) {
        System.out.println("Refunded ₹" + amount + " to Wallet");
    }
}

