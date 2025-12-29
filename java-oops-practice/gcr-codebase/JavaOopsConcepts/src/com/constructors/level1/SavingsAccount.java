package com.constructors.level1;

//Subclass
class SavingsAccount extends BankAccount {

 double interestRate;

 // Constructor
 SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
     super(accountNumber, accountHolder, balance);
     this.interestRate = interestRate;
 }

 // Method demonstrating access modifiers
 void displayDetails() {
     System.out.println("Account Number: " + accountNumber);     // public
     System.out.println("Account Holder: " + accountHolder);     // protected
     System.out.println("Balance: ₹" + getBalance());            // private via getter
     System.out.println("Interest Rate: " + interestRate + "%");
 }

 // Main method
 public static void main(String[] args) {

     SavingsAccount sa = new SavingsAccount(
             "SBIN123456",
             "Khushi Agrawal",
             50000,
             4.5
     );

     sa.displayDetails();

     // Modify balance
     sa.setBalance(60000);

     System.out.println("\nAfter Balance Update:");
     sa.displayDetails();
 }
}

