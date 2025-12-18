// Program to find power of a number using while loop
import java.util.Scanner;

public class PowerWhile {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = input.nextInt();

        System.out.print("Enter power: ");
        int power = input.nextInt();

        int result = 1;
        int counter = 0;

        while (counter < power) {
            result *= number;
            counter++;
        }

        System.out.println("Result = " + result);

        input.close();
    }
}
