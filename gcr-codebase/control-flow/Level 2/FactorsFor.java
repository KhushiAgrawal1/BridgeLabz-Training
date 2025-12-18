// Program to find factors of a number using for loop
import java.util.Scanner;

public class FactorsFor {

    public static void main(String[] args) {

        // Scanner object
        Scanner input = new Scanner(System.in);

        // Read number
        System.out.print("Enter number: ");
        int number = input.nextInt();

        // Check positive number
        if (number > 0) {

            // Loop to find factors
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
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
