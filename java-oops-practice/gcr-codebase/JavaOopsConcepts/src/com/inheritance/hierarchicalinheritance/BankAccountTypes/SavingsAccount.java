package com.inheritance.hierarchicalinheritance.BankAccountTypes;

public class SavingsAccount extends BankAccount {
	
	private double interestRate;	
	
	public SavingsAccount(int accountNumber, double balance, double interestRate) {
		super(accountNumber, balance);
		this.interestRate = interestRate;
	}

	void displayAccountType() {
		super.displayAccountType();
		System.out.println("Account Type: Savings Account");
		System.out.println("Interest Rate : " + interestRate);
	}

}
