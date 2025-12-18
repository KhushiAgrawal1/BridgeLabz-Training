// Program to perform rocket countdown using while loop
import java.util.Scanner;

public class CountdownWhile {

    public static void main(String[] args) {

        // Scanner for input
        Scanner input = new Scanner(System.in);

        // Take countdown starting number
        System.out.print("Enter countdown number: ");
        int counter = input.nextInt();

        // Countdown until 1
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }

        // Close Scanner
        input.close();
    }
}
