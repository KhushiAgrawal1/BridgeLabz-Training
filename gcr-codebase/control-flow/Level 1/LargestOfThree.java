// Program to check which number is the largest among three numbers
import java.util.Scanner;

public class LargestOfThree {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take three numbers as input
        System.out.print("Enter number1: ");
        int n1 = input.nextInt();

        System.out.print("Enter number2: ");
        int n2 = input.nextInt();

        System.out.print("Enter number3: ");
        int n3 = input.nextInt();

        // Check each number and print result
        System.out.println("Is the first number the largest? " + (n1 > n2 && n1 > n3));
        System.out.println("Is the second number the largest? " + (n2 > n1 && n2 > n3));
        System.out.println("Is the third number the largest? " + (n3 > n1 && n3 > n2));

        // Close Scanner
        input.close();
    }
}
