import java.util.Scanner;

public class ArrayIndexOutDemo {

    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateException(String[] names) {
        // Accessing index beyond array length
        System.out.println(names[names.length]);
    }

    // Method to handle ArrayIndexOutOfBoundsException
    public static void handleException(String[] names) {
        try {
            // Accessing index beyond array length
            System.out.println(names[names.length]);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException handled.");
            System.out.println("Error message: " + e);
        } 
        catch (RuntimeException e) {
            System.out.println("Generic RuntimeException handled.");
            System.out.println("Error message: " + e);
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take array size from user
        System.out.print("Enter number of names: ");
        int size = input.nextInt();

        String[] names = new String[size];

        // Take names as input
        for (int i = 0; i < size; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = input.next();
        }

        // First: call method that generates the exception
        System.out.println("\nGenerating ArrayIndexOutOfBoundsException:");
        try {
            generateException(names);
        } catch (RuntimeException e) {
            System.out.println("Exception occurred in main(): " + e);
        }

        // Second: call method that handles the exception
        System.out.println("\nHandling ArrayIndexOutOfBoundsException:");
        handleException(names);

        input.close();
    }
}
