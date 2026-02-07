package com.multithreading.Banking_System_with_Multiple_Transactions;

import java.time.LocalDateTime;

public class Transaction implements Runnable {
    private BankAccount account;
    private String customerName;
    private int amount;

    public Transaction(BankAccount account, String customerName, int amount) {
        this.account = account;
        this.customerName = customerName;
        this.amount = amount;
    }

    @Override
    public void run() {
        System.out.println("[" + customerName + "] Attempting to withdraw " + amount
                + " at " + LocalDateTime.now());

        account.withdraw(amount);
    }
}
