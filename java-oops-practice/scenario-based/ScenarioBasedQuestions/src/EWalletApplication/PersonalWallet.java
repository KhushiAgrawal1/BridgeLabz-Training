package EWalletApplication;

public class PersonalWallet extends Wallet implements Transferrable {

    public PersonalWallet(double balance) {
        super(balance);
    }

    public void transferTo(Wallet receiver, double amount) {
        updateBalance(-amount);
        receiver.updateBalance(amount);
    }
}
