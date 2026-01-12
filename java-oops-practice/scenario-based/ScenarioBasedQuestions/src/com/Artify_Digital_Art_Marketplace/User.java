package com.Artify_Digital_Art_Marketplace;

public class User{
	String name;
	int walletBalance;
	
	public User(String name, int walletBalance) {
		this.name = name;
		this.walletBalance = walletBalance;
	}
	
	void getDetails() {
		System.out.println("User name is : " + name);
		System.out.println("Wallet Balance is : " + walletBalance);
	}
	
}
