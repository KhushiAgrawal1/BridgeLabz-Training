package com.E_Wallet_Application;

public class Wallet implements Transferrable {
    private double balance;

    public Wallet(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void transferTo(User receiver, double amount) {
        if (balance >= amount) {
            balance -= amount;
            receiver.getWallet().balance += amount;
        }
    }
}
