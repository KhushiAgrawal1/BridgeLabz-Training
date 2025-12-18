// Program to check whether a number is positive, negative or zero
import java.util.Scanner;

public class NumberType {

    public static void main(String[] args) {

        // Scanner object for input
        Scanner input = new Scanner(System.in);

        // Read number from user
        System.out.print("Enter number: ");
        int number = input.nextInt();

        // Check the type of number
        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }

        // Close Scanner
        input.close();
    }
}
