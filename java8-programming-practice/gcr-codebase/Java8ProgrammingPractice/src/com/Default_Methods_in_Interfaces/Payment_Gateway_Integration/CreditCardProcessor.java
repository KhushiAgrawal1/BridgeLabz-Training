package com.Default_Methods_in_Interfaces.Payment_Gateway_Integration;

class CreditCardProcessor implements PaymentProcessor {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card");
    }
}

