package com.Artify_Digital_Art_Marketplace;

import java.util.Scanner;

public class ArtifyApp{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter username: ");
		String username = sc.next();
		
		System.out.println("Enter walletBalance: ");
		int walletBalance = sc.nextInt();
		
		User user1 = new User(username, walletBalance);
		user1.getDetails();
		
		System.out.println("------------------------------------");
		
		System.out.println("Enter title: ");
		String title = sc.next();
		
		System.out.println("Enter artist: ");
		String artist = sc.next();
		
		System.out.println("Enter price: ");
		int price = sc.nextInt();
		
		System.out.println("Enter license type: ");
		String licenseType = sc.next();
		
		System.out.println("--------------Welcome to Artwork---------------");
		System.out.println("1. Digital Art");
		System.out.println("2. Print Art");
		System.out.println("Exit");
		System.out.println("Enter choice:");
		int choice = sc.nextInt();
		
				
		Artwork artwork=null;
		
		switch(choice) {
		case 1:
			artwork = new DigitalArt(title, artist, price, licenseType, true);
			break;
		case 2:
			artwork = new PrintArt(title, artist, price, licenseType, true);
			break;
		case 3:	
			System.out.println("Exit!");
			return;
		default:
			System.out.println("Invalid input!");
		}
		
		artwork.purchase(user1);
		artwork.license();
		System.out.println("------------------------------------");
		artwork.displayDetails();
			
	}
}