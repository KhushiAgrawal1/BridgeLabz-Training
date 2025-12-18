// Program to print odd and even numbers from 1 to given number
import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {

        // Scanner object
        Scanner input = new Scanner(System.in);

        // Read number
        System.out.print("Enter number: ");
        int n = input.nextInt();

        // Loop from 1 to n
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is Even");
            } else {
                System.out.println(i + " is Odd");
            }
        }

        // Close Scanner
        input.close();
    }
}
