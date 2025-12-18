// Program to check whether a number is a natural number and find its sum
import java.util.Scanner;

public class NaturalNumberSum {

    public static void main(String[] args) {

        // Scanner for input
        Scanner input = new Scanner(System.in);

        // Take number from user
        System.out.print("Enter number: ");
        int n = input.nextInt();

        // Check if number is natural
        if (n > 0) {
            // Calculate sum using formula
            System.out.println("The sum of " + n + " natural numbers is " + (n * (n + 1) / 2));
        } else {
            // If number is not natural
            System.out.println("The number " + n + " is not a natural number");
        }

        // Close Scanner
        input.close();
    }
}
