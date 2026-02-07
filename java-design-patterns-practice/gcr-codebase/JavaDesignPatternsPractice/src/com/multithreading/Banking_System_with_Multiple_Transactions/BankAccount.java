package com.multithreading.Banking_System_with_Multiple_Transactions;

public class BankAccount {
    private int balance = 10000;

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Transaction successful: Amount: " 
                    + amount + ", Remaining Balance: " + balance);
        } else {
            System.out.println("Transaction failed: Insufficient balance for amount " + amount);
        }
    }
}

