package com.Helper_Methods;

public class MainApp {
    public static void main(String[] args) {

        Customer customer = new Customer("Khushi", 101);
        SavingsAccount account =
                new SavingsAccount(12345, 120000, 4.5);

        // Validate input
        if (!BankHelper.validateUserInput(customer, account)) {
            System.out.println("Invalid input!");
            return;
        }

        // Check loan eligibility
        if (BankHelper.checkLoanEligibility(account)) {
            System.out.println("Customer is eligible for loan");
        } else {
            System.out.println("Customer is NOT eligible for loan");
        }

        // Calculate discount
        double discount = BankHelper.calculateDiscount(account);
        System.out.println("Discount Amount: " + discount);

        // Example helper method
        System.out.println("Is 'madam' palindrome? " +
                BankHelper.isPalindrome("madam"));
    }
}
