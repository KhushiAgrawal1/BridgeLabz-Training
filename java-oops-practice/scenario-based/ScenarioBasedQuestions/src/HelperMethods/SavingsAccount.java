package com.HelperMethods;

public class SavingsAccount extends Account {
    double interestRate;

    public SavingsAccount(double balance, String accountNumber, double interestRate) {
        super(balance, accountNumber);
        this.interestRate = interestRate;
    }
}
