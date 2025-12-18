// Program to calculate factorial using for loop
import java.util.Scanner;

public class FactorialFor {

    public static void main(String[] args) {

        // Scanner object
        Scanner input = new Scanner(System.in);

        // Read number
        System.out.print("Enter number: ");
        int n = input.nextInt();

        // Check for positive number
        if (n > 0) {
            int fact = 1;

            // Calculate factorial using for loop
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }

            // Print factorial
            System.out.println("Factorial = " + fact);
        } else {
            System.out.println("Enter a positive number");
        }

        // Close Scanner
        input.close();
    }
}
