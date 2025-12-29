package com.constructors.level1;

class BankAccount {

    // Public variable
    public String accountNumber;

    // Protected variable
    protected String accountHolder;

    // Private variable
    private double balance;

    // Constructor
    BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Setter / modifier for balance
    public void setBalance(double balance) {
        this.balance = balance;
    }
}

