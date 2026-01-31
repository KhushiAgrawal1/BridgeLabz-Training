package com.Default_Methods_in_Interfaces.Payment_Gateway_Integration;

public class PaymentApp {
    public static void main(String[] args) {

        PaymentProcessor p1 = new CreditCardProcessor();
        PaymentProcessor p2 = new WalletProcessor();

        p1.pay(1000);
        p1.refund(500);

        p2.pay(2000);
        p2.refund(1000);
    }
}
