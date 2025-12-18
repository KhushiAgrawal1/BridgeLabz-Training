// Program to print FizzBuzz using for loop
import java.util.Scanner;

public class FizzBuzzFor {

    public static void main(String[] args) {

        // Scanner object
        Scanner input = new Scanner(System.in);

        // Read input number
        System.out.print("Enter number: ");
        int number = input.nextInt();

        // Check positive integer
        if (number > 0) {

            // Loop from 1 to number
            for (int i = 1; i <= number; i++) {

                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }

        } else {
            System.out.println("Enter a positive integer");
        }

        // Close Scanner
        input.close();
    }
}
