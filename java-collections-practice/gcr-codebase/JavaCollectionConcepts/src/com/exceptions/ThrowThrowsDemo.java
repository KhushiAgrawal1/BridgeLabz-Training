package com.exceptions;

import java.util.Scanner;

public class ThrowThrowsDemo {

    // Method to calculate simple interest
    public static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {
        if (amount < 0 || rate < 0) {
            // throw IllegalArgumentException if invalid
            throw new IllegalArgumentException("Invalid input: Amount and rate must be positive");
        }

        return (amount * rate * years) / 100;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter principal amount: ");
            double amount = sc.nextDouble();

            System.out.print("Enter interest rate (%): ");
            double rate = sc.nextDouble();

            System.out.print("Enter time (years): ");
            int years = sc.nextInt();

            // Call method that may throw exception
            double interest = calculateInterest(amount, rate, years);

            System.out.println("Calculated Interest: " + interest);

        } catch (IllegalArgumentException e) {
            // Handle exception propagated from method
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}

