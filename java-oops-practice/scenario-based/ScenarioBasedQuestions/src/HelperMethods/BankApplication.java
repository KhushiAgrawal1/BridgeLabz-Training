package com.HelperMethods;

import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String name = sc.nextLine();

        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();

        if (!HelperMethods.validateUserInput(name, balance)) {
            System.out.println("Invalid input!");
            return;
        }

        Customer customer = new Customer(name, 101);
        SavingsAccount sa = new SavingsAccount(balance, "SA1001", 4.5);

        System.out.println("\nCustomer Name: " + customer.name);
        System.out.println("Account Number: " + sa.accountNumber);
        System.out.println("Balance: ₹" + sa.balance);

        if (HelperMethods.checkLoanEligibility(sa.balance)) {
            System.out.println("Loan Eligible ✔");
        } else {
            System.out.println("Loan Not Eligible ✖");
        }

        double discount = HelperMethods.calculateDiscount(sa.balance);
        System.out.println("Discount Amount: ₹" + discount);

        sc.close();
    }
}
