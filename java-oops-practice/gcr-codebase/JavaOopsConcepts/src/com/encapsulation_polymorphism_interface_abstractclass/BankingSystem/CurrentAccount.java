package com.encapsulation_polymorphism_interface_abstractclass.BankingSystem;

public class CurrentAccount extends BankAccount implements Loanable {

    public CurrentAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public double calculateInterest() {
        return balance * 0.02; // 2% interest
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Current Account Loan Applied: ₹" + amount);
    }

    @Override
    public boolean calculateLoanEligibility() {
        return balance >= 100000;
    }
}
