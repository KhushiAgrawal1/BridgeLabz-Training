import java.util.Scanner;

public class IllegalArgumentDemo {

    // Method to generate IllegalArgumentException
    public static void generateException(String text) {
        // Start index is greater than end index
        System.out.println(text.substring(5, 2));
    }

    // Method to handle IllegalArgumentException
    public static void handleException(String text) {
        try {
            // Start index is greater than end index
            System.out.println(text.substring(5, 2));
        } 
        catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException handled.");
            System.out.println("Error message: " + e);
        } 
        catch (RuntimeException e) {
            System.out.println("Generic RuntimeException handled.");
            System.out.println("Error message: " + e);
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = input.next();

        // First: call method that generates exception
        System.out.println("\nGenerating IllegalArgumentException:");
        try {
            generateException(text);
        } catch (RuntimeException e) {
            System.out.println("Exception occurred in main(): " + e);
        }

        // Second: call method that handles the exception
        System.out.println("\nHandling IllegalArgumentException:");
        handleException(text);

        input.close();
    }
}
