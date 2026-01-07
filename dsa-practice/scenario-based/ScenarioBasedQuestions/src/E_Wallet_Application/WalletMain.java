package E_Wallet_Application;

public class WalletMain {
    public static void main(String[] args) {
        User u1 = new User("Khushi", new Wallet(5000));
        User u2 = new User("Rohit", new BusinessWallet(3000));

        u1.getWallet().transferTo(u2, 1000);
        System.out.println("Khushi Balance: " + u1.getWallet().getBalance());
    }
}

