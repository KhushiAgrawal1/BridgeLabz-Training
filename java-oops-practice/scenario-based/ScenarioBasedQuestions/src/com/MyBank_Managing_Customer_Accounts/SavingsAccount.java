package com.MyBank_Managing_Customer_Accounts;

public class SavingsAccount extends Account implements ITransaction {

    private static final double INTEREST_RATE = 4.0;

    public SavingsAccount(String accNo, double balance) {
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

