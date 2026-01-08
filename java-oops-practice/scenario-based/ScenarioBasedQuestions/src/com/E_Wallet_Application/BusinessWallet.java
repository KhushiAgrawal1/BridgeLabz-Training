package com.E_Wallet_Application;

public class BusinessWallet extends Wallet {

    public BusinessWallet(double balance) {
        super(balance);
    }

    @Override
    public void transferTo(User receiver, double amount) {
        super.transferTo(receiver, amount + 10);
    }
}

