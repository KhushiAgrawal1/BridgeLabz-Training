package com.inheritance.hierarchicalinheritance.BankAccountTypes;

public class BankAccountTypes {
	public static void main(String[] args) {

	SavingsAccount sa =
            new SavingsAccount(101, 50000, 4.5);

    CheckingAccount ca =
            new CheckingAccount(201, 30000, 10000);

    FixedDepositAccount fd =
            new FixedDepositAccount(301, 100000, 5);

    sa.displayAccountType();
    System.out.println();

    ca.displayAccountType();
    System.out.println();

    fd.displayAccountType();
	}
	

}
