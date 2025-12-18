// Program to find sum until user enters zero or negative number
import java.util.Scanner;

public class SumWithBreak {

    public static void main(String[] args) {

        // Scanner object
        Scanner input = new Scanner(System.in);
        double total = 0;

        // Infinite loop
        while (true) {
            System.out.print("Enter number: ");
            double num = input.nextDouble();

            // Break if zero or negative
            if (num <= 0) {
                break;
            }

            total += num;
        }

        // Display sum
        System.out.println("Total sum = " + total);

        // Close Scanner
        input.close();
    }
}
