// Program to print multiplication table from 6 to 9
import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        // Scanner object
        Scanner input = new Scanner(System.in);

        // Read number
        System.out.print("Enter number: ");
        int number = input.nextInt();

        // Print table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }

        // Close Scanner
        input.close();
    }
}
