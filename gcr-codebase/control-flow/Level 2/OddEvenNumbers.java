// Program to print odd and even numbers between 1 and given number
import java.util.Scanner;

public class OddEvenNumbers {

    public static void main(String[] args) {

        // Create Scanner object for input
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter number: ");
        int number = input.nextInt();

        // Check for natural number
        if (number > 0) {

            // Loop from 1 to number
            for (int i = 1; i <= number; i++) {

                // Check odd or even
                if (i % 2 == 0) {
                    System.out.println(i + " is Even");
                } else {
                    System.out.println(i + " is Odd");
                }
            }

        } else {
            System.out.println("Enter a natural number");
        }

        // Close input stream
        input.close();
    }
}
