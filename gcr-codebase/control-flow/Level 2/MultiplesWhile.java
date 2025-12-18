// Program to find multiples of a number below 100 using while loop
import java.util.Scanner;

public class MultiplesWhile {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = input.nextInt();

        if (number > 0 && number < 100) {

            int i = 100;

            while (i >= 1) {
                if (i % number == 0) {
                    System.out.println(i);
                }
                i--;
            }

        } else {
            System.out.println("Enter number between 1 and 99");
        }

        input.close();
    }
}
