package com.objectmodeling;

public class BankTest {
    public static void main(String[] args) {

        Bank bank = new Bank("State Bank");
        Customer c1 = new Customer("Khushi", 5000);

        bank.openAccount(c1);
        c1.viewBalance();
    }
}
