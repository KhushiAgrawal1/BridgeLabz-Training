// Program to check if a number is divisible by 5
import java.util.Scanner;

public class DivisibleByFive {

    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        // Ask user to enter a number
        System.out.print("Enter number: ");
        int number = input.nextInt();

        // Check divisibility by 5
        boolean result = number % 5 == 0;

        // Display the result
        System.out.println("Is the number " + number + " divisible by 5? " + result);

        // Close the input stream
        input.close();
    }
}
