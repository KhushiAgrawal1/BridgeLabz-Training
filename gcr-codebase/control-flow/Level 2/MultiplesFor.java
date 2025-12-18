// Program to find multiples of a number below 100 using for loop
import java.util.Scanner;

public class MultiplesFor {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = input.nextInt();

        if (number > 0 && number < 100) {

            for (int i = 100; i >= 1; i--) {
                if (i % number == 0) {
                    System.out.println(i);
                }
            }

        } else {
            System.out.println("Enter number between 1 and 99");
        }

        input.close();
    }
}
