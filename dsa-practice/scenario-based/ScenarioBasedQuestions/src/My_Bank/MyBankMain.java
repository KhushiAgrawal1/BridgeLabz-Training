package My_Bank;

public class MyBankMain {
    public static void main(String[] args) {

        Account acc = new SavingsAccount("SB101", 10000); // Polymorphism
        ITransaction txn = (ITransaction) acc;

        txn.deposit(2000);
        txn.withdraw(1000);

        System.out.println("Balance: ₹" + txn.checkBalance());

        SavingsAccount sa = (SavingsAccount) acc;
        System.out.println("Interest: ₹" + sa.calculateInterest());
    }
}

