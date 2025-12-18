// Program to find youngest and tallest among Amar, Akbar and Anthony
import java.util.Scanner;

public class FriendsComparison {

    public static void main(String[] args) {

        // Scanner object
        Scanner input = new Scanner(System.in);

        // Take age inputs
        System.out.print("Enter Amar age: ");
        int amarAge = input.nextInt();

        System.out.print("Enter Akbar age: ");
        int akbarAge = input.nextInt();

        System.out.print("Enter Anthony age: ");
        int anthonyAge = input.nextInt();

        // Take height inputs
        System.out.print("Enter Amar height: ");
        int amarHeight = input.nextInt();

        System.out.print("Enter Akbar height: ");
        int akbarHeight = input.nextInt();

        System.out.print("Enter Anthony height: ");
        int anthonyHeight = input.nextInt();

        // Find youngest
        int youngestAge = Math.min(amarAge, Math.min(akbarAge, anthonyAge));
        System.out.println("Youngest age = " + youngestAge);

        // Find tallest
        int tallestHeight = Math.max(amarHeight, Math.max(akbarHeight, anthonyHeight));
        System.out.println("Tallest height = " + tallestHeight);

        // Close Scanner
        input.close();
    }
}
