// Program to find sum of numbers until user enters zero
import java.util.Scanner;

public class SumUntilZero {

    public static void main(String[] args) {

        // Scanner object
        Scanner input = new Scanner(System.in);
        double total = 0;
        double num;

        // Read first number
        System.out.print("Enter number: ");
        num = input.nextDouble();

        // Continue till user enters 0
        while (num != 0) {
            total += num;
            System.out.print("Enter number: ");
            num = input.nextDouble();
        }

        // Print total sum
        System.out.println("Total sum = " + total);

        // Close Scanner
        input.close();
    }
}
