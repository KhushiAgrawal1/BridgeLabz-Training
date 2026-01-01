package com.encapsulation_polymorphism_interface_abstractclass.BankingSystem;

public interface Loanable {

    void applyForLoan(double amount);

    boolean calculateLoanEligibility();
}
