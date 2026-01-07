package Helper_Methods;

class Account {
    protected double balance;
    protected int accountNumber;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}

