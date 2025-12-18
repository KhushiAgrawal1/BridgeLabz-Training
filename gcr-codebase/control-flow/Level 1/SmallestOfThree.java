// Program to check if the first number is the smallest among three numbers
import java.util.Scanner;

public class SmallestOfThree {

    public static void main(String[] args) {

        // Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Read three numbers from user
        System.out.print("Enter number1: ");
        int n1 = input.nextInt();

        System.out.print("Enter number2: ");
        int n2 = input.nextInt();

        System.out.print("Enter number3: ");
        int n3 = input.nextInt();

        // Check if first number is smaller than other two
        System.out.println("Is the first number the smallest? " + (n1 < n2 && n1 < n3));

        // Close Scanner
        input.close();
    }
}
