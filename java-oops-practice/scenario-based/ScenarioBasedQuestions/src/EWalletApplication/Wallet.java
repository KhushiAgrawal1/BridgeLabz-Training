package EWalletApplication;

public class Wallet {
    private double balance;

    public Wallet(double balance) {
        this.balance = balance;
    }

    protected void updateBalance(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}

