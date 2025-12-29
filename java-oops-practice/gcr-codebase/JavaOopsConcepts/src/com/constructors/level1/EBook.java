package com.constructors.level1;


//Subclass
public class EBook extends TextBook {

String format;

// Constructor
EBook(String ISBN, String title, String author, String format) {
   super(ISBN, title, author);
   this.format = format;
}

// Method demonstrating access modifiers
void displayDetails() {
   System.out.println("ISBN: " + ISBN);           // public
   System.out.println("Title: " + title);         // protected
   System.out.println("Author: " + getAuthor());  // private via getter
   System.out.println("Format: " + format);
}

public static void main(String[] args) {

   EBook ebook = new EBook(
           "978-93-5025-123-4",
           "Java Programming",
           "Herbert Schildt",
           "PDF"
   );
   ebook.displayDetails();
}
}

