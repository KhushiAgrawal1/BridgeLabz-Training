package EWalletApplication;

public class BusinessWallet extends Wallet implements Transferrable {

    public BusinessWallet(double balance) {
        super(balance);
    }

    public void transferTo(Wallet receiver, double amount) {
        double tax = amount * 0.02;
        updateBalance(-(amount + tax));
        receiver.updateBalance(amount);
    }
}
