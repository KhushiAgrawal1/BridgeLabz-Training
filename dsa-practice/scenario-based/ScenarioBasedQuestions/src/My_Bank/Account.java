package My_Bank;

public class Account {
    protected String accountNumber;
    private double balance;

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public Account(String accountNumber, double openingBalance) {
        this.accountNumber = accountNumber;
        this.balance = openingBalance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    protected double getBalanceInternal() {
        return balance;
    }

    public double checkBalance() {
        return balance;
    }
}

