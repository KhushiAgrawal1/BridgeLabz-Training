package com.MyBank_Managing_Customer_Accounts;

public class CurrentAccount extends Account implements ITransaction {

    private static final double INTEREST_RATE = 1.5;

    public CurrentAccount(String accNo, double balance) {
        super(accNo, balance);
    }

    public void deposit(double amount) {
        setBalance(getBalanceInternal() + amount);
    }

    public void withdraw(double amount) {
        setBalance(getBalanceInternal() - amount);
    }

    public double calculateInterest() {
        return getBalanceInternal() * INTEREST_RATE / 100;
    }
}

