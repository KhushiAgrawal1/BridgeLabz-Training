package com.Artify_Digital_Art_Marketplace;

public class Artwork implements IPurchasable{
	String title;
	String artist;
	int price;
    String licenseType;
    boolean hasPreview;  

	public Artwork(String title, String artist, int price, String licenseType, boolean hasPreview) {
		this.title = title;
		this.artist = artist;
		this.price = price;
		this.licenseType = licenseType;
		this.hasPreview = false;
	}


	@Override
	public void purchase(User user) {
		if(user.walletBalance >= price) {
			user.walletBalance -= price;
			System.out.println("License purchased!");
		}
		else {
			System.out.println("Insufficient balance!");
		}
	}


	@Override
	public void license() {
		System.out.println("License Type: " + licenseType);
	}
	
	void displayDetails() {
		System.out.println("Title is : " + title);
		System.out.println("Artist is : " + artist);
		System.out.println("Price is " + price);
		System.out.println("License type : " + licenseType);
			
		
	}
    
	
    
}
