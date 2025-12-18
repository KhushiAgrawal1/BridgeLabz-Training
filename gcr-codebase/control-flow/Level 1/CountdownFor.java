// Program to perform rocket countdown using for loop
import java.util.Scanner;

public class CountdownFor {

    public static void main(String[] args) {

        // Scanner object
        Scanner input = new Scanner(System.in);

        // Take countdown number
        System.out.print("Enter countdown number: ");
        int n = input.nextInt();

        // Loop from n to 1
        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }

        // Close Scanner
        input.close();
    }
}
