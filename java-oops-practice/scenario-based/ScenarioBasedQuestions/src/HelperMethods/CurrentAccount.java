package com.HelperMethods;

public class CurrentAccount extends Account {
    double overdraftLimit;

    public CurrentAccount(double balance, String accountNumber, double overdraftLimit) {
        super(balance, accountNumber);
        this.overdraftLimit = overdraftLimit;
    }
}
