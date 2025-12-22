// Program Title : NumberFormatException Demonstration
// Description   : This program demonstrates NumberFormatException by
//                 attempting to convert a non-numeric string to an integer
//                 and shows how to handle it using try-catch.

import java.util.Scanner;

public class NumberFormatDemo {

    // Method to generate NumberFormatException
    public static void generateException(String text) {
        // Attempt to parse non-numeric text
        int number = Integer.parseInt(text);
        System.out.println("Converted number: " + number);
    }

    // Method to handle NumberFormatException
    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Converted number: " + number);
        } 
        catch (NumberFormatException e) {
            System.out.println("NumberFormatException handled.");
            System.out.println("Error message: " + e);
        } 
        catch (RuntimeException e) {
            System.out.println("Generic RuntimeException handled.");
            System.out.println("Error message: " + e);
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input as String
        System.out.print("Enter a value: ");
        String text = input.next();

        // Calling method that generates exception
        System.out.println("\nGenerating NumberFormatException:");
        try {
            generateException(text);
        } catch (RuntimeException e) {
            System.out.println("Exception occurred in main(): " + e);
        }

        // Calling method that handles exception
        System.out.println("\nHandling NumberFormatException:");
        handleException(text);

        input.close();
    }
}
