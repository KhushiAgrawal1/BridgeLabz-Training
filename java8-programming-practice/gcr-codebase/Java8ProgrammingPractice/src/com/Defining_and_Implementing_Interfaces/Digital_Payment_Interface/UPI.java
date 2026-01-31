package com.Defining_and_Implementing_Interfaces.Digital_Payment_Interface;

class UPI implements Payment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
    }
}
