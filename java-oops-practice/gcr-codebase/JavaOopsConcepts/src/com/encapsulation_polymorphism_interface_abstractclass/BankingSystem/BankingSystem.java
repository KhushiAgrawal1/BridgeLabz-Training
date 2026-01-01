package com.encapsulation_polymorphism_interface_abstractclass.BankingSystem;

import java.util.ArrayList;
import java.util.List;

public class BankingSystem {

    public static void main(String[] args) {

        List<BankAccount> accounts = new ArrayList<>();

        BankAccount acc1 = new SavingsAccount("SA101", "Ravi", 60000);
        BankAccount acc2 = new CurrentAccount("CA202", "Neha", 150000);

        acc1.deposit(5000);
        acc2.withdraw(20000);

        accounts.add(acc1);
        accounts.add(acc2);

        // Polymorphism
        for (BankAccount acc : accounts) {
            System.out.println("Account Holder: " + acc.getHolderName());
            System.out.println("Balance: ₹" + acc.getBalance());
            System.out.println("Interest: ₹" + acc.calculateInterest());

            if (acc instanceof Loanable) {
                Loanable loanAcc = (Loanable) acc;
                loanAcc.applyForLoan(50000);
                System.out.println("Loan Eligible: " + loanAcc.calculateLoanEligibility());
            }

            System.out.println("--------------------------");
        }
    }
}
