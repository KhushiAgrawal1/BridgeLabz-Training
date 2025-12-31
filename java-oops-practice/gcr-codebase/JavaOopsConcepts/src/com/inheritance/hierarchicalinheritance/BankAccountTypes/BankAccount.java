package com.inheritance.hierarchicalinheritance.BankAccountTypes;

public class BankAccount {
	protected int accountNumber;
	protected double balance;
	public BankAccount(int accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	void displayAccountType() {
		System.out.println("Account Number : " + accountNumber);
		System.out.println("Balance : " + balance);		
	}
	
}
