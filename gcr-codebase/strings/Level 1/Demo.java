// Program Title : StringIndexOutOfBoundsException Demo
// Description   : This program demonstrates StringIndexOutOfBoundsException
//                 by accessing an invalid index of a string and then
//                 shows how to handle it using try-catch.

import java.util.Scanner;

public class Demo {

    // Method to generate StringIndexOutOfBoundsException
    public static void generateException(String text) {
        // Accessing index equal to string length (invalid index)
        System.out.println(text.charAt(text.length()));
    }

    // Method to handle StringIndexOutOfBoundsException
    public static void handleException(String text) {
        try {
            // This statement causes the exception
            System.out.println(text.charAt(text.length()));
        }
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("String IndexOutOfBounds Exception Handled.");
            System.out.println("Error message: " + e);
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take string input from user
        System.out.print("Enter a string: ");
        String text = input.next();

        // Calling method that generates exception
        System.out.println("String IndexOutOfBounds Exception : ");
        try {
            generateException(text);
        }
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception occurred in main: " + e);
        }

        // Calling method that handles exception
        System.out.println("Handling String IndexOutOfBounds Exception : ");
        handleException(text);

        input.close();
    }
}
