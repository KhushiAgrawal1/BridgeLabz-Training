// Program to find factors of a number using while loop
import java.util.Scanner;

public class FactorsWhile {

    public static void main(String[] args) {

        // Scanner object
        Scanner input = new Scanner(System.in);

        // Read number
        System.out.print("Enter number: ");
        int number = input.nextInt();

        // Check positive number
        if (number > 0) {

            int i = 1;

            // Loop to find factors
            while (i < number) {
                if (number % i == 0) {
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
