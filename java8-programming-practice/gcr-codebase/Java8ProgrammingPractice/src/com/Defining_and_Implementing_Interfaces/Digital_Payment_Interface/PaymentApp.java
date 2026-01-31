package com.Defining_and_Implementing_Interfaces.Digital_Payment_Interface;

public class PaymentApp {
    public static void main(String[] args) {

        Payment p1 = new UPI();
        Payment p2 = new CreditCard();
        Payment p3 = new Wallet();

        p1.pay(500);
        p2.pay(1200);
        p3.pay(300);
    }
}
