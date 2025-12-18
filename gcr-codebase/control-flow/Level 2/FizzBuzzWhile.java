// Program to print FizzBuzz using while loop
import java.util.Scanner;

public class FizzBuzzWhile {

    public static void main(String[] args) {

        // Scanner object
        Scanner input = new Scanner(System.in);

        // Read input
        System.out.print("Enter number: ");
        int number = input.nextInt();

        // Check positive number
        if (number > 0) {

            int i = 1;

            // Loop till number
            while (i <= number) {

                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }

                i++;
            }

        } else {
            System.out.println("Enter a positive integer");
        }

        // Close Scanner
        input.close();
    }
}
