package com.exceptions.Bank_Transaction_System;

import java.util.Scanner;

public class BankAccountDemo {

    static class BankAccount {
        private double balance;

        // Constructor
        public BankAccount(double balance) {
            this.balance = balance;
        }

        // Withdraw method with exceptions
        public void withdraw(double amount) throws InsufficientBalanceException {
            if (amount < 0) {
                throw new IllegalArgumentException("Invalid amount!");
            }
            if (amount > balance) {
                throw new InsufficientBalanceException("Insufficient balance!");
            }
            balance -= amount;
            System.out.println("Withdrawal successful, new balance: " + balance);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create account with initial balance
        BankAccount account = new BankAccount(5000);

        try {
            System.out.print("Enter amount to withdraw: ");
            double amount = sc.nextDouble();

            account.withdraw(amount);

        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}

