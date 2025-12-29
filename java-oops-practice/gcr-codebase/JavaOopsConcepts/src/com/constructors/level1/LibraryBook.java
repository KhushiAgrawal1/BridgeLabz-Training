package com.constructors.level1;

public class LibraryBook {
	
	String title;
	String author;
	Double price;
	boolean availability;
	
	LibraryBook(){
		title = "Wings of fire";
		author = "APJ Sir";
		price = 15151;
	}
	void getDetails() {
		System.out.println("Title : " + title);
		System.out.println("Author : " + author);
		System.out.println("Price : " + price);
	}
	void checkStatus() {
		if()
	}

	public static void main(String[] args) {
		LibraryBook b1 = new LibraryBook();
		b1.getDetails();
		b1.checkStatus();
	}

}
