// Program to find sum of n natural numbers using for loop
import java.util.Scanner;

public class NaturalSumFor {

    public static void main(String[] args) {

        // Scanner object
        Scanner input = new Scanner(System.in);

        // Read number
        System.out.print("Enter number: ");
        int n = input.nextInt();

        // Check natural number
        if (n > 0) {
            int sum = 0;

            // Calculate sum using for loop
            for (int i = 1; i <= n; i++) {
                sum += i;
            }

            // Display results
            System.out.println("For loop sum = " + sum);
            System.out.println("Formula sum = " + (n * (n + 1) / 2));
        } else {
            System.out.println("Not a natural number");
        }

        // Close Scanner
        input.close();
    }
}
