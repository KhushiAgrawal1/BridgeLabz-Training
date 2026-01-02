package com.HelperMethods;

public class HelperMethods {

    // Validate user input
    public static boolean validateUserInput(String name, double amount) {
        return name != null && !name.isEmpty() && amount > 0;
    }

    // Check loan eligibility
    public static boolean checkLoanEligibility(double balance) {
        return balance >= 50000;
    }

    // Calculate discount
    public static double calculateDiscount(double balance) {
        if (balance >= 100000) {
            return balance * 0.10;
        } else if (balance >= 50000) {
            return balance * 0.05;
        }
        return 0;
    }
}
