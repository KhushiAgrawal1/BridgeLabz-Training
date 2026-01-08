package com.Helper_Methods;

public class BankHelper {

    // 1️⃣ Validate user input
    public static boolean validateUserInput(Customer customer, Account account) {
        if (customer.getName() == null || customer.getName().isEmpty()) {
            return false;
        }
        if (account.getBalance() < 0) {
            return false;
        }
        return true;
    }

    // 2️⃣ Check loan eligibility
    public static boolean checkLoanEligibility(Account account) {
        return account.getBalance() >= 50000;
    }

    // 3️⃣ Calculate discount based on balance
    public static double calculateDiscount(Account account) {
        double balance = account.getBalance();

        if (balance > 100000) {
            return balance * 0.10; // 10% discount
        } else {
            return balance * 0.05; // 5% discount
        }
    }

    // Example helper method
    public static boolean isPalindrome(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        return s.equals(rev);
    }
}

