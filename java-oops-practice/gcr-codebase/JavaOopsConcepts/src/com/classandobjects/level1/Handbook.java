package com.classandobjects.level1;

public class Handbook {
	//Declaring the variables to get the details of hand book
	String bookTitle;
	String bookAuthor;
	double price;
	
	//constructor
	Handbook(String bookTitle,String bookAuthor,double price){
		this.bookTitle=bookTitle;
		this.bookAuthor=bookAuthor;
		this.price=price;
	}
	
	//creating the method to display the output
	public void displayBookDetails() {
		System.out.println("Title of the book: "+bookTitle);
		System.out.println("Author of the book: "+bookAuthor);
		System.out.println("Price of the book: "+price);
	}
	
	public static void main(String[] args) {
	Handbook book1= new Handbook("2States", "Chetan Bhagat", 500);
	Handbook book2=new Handbook("Wings Of Fire","Abdul kalam.A.P.J",  500);
	book1.displayBookDetails();
	book2.displayBookDetails();
	}
}
