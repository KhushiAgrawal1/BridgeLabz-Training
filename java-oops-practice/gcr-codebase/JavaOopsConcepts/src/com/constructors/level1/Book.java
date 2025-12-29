package com.constructors.level1;

public class Book {
	
	String title;
	String author;
	Double price;
	
	public Book() {
		title = "Unknown";
		author = "Unknown";
		price = 0.00;
	}
	
	public Book(String title, String author, Double price)
	{
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	void getDetails() {
			System.out.println("Title: " + title);
			System.out.println("Author : " + author);
			System.out.println("Price : " + price);	
	}
	
	public static void main(String[] args) {
	Book b1 = new Book("wings of fire","APJ Abdul Kalam",553.0);
	b1.getDetails();	
	
	Book b2 = new Book();
	b2.getDetails();
	}
	
}
