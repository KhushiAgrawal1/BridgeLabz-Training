package com.inheritance.hierarchicalinheritance.BankAccountTypes;

public class FixedDepositAccount extends BankAccount {
	
	private int maturityPeriod; // in years

    public FixedDepositAccount(int accountNumber, double balance, int maturityPeriod) {
        super(accountNumber, balance);
        this.maturityPeriod = maturityPeriod;
    }

    public void displayAccountType() {
    	super.displayAccountType();
        System.out.println("Account Type: Fixed Deposit Account");
        System.out.println("Maturity Period: " + maturityPeriod + " years");
    }

}
