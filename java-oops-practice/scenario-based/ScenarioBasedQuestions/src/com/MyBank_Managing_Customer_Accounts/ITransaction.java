package com.MyBank_Managing_Customer_Accounts;

public interface ITransaction {
    void deposit(double amount);
    void withdraw(double amount);
    double checkBalance();
}

