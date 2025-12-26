import java.util.Scanner; // Import Scanner class for user input

public class AddTwoNumbers {

    public static void main(String[] args) {

        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Ask the user to enter two numbers
        System.out.println("Enter Two Numbers: ");

        // Read the first number
        int num1 = input.nextInt();

        // Read the second number
        int num2 = input.nextInt();

        // Calculate and display the sum of the two numbers
        System.out.println("Sum is: " + (num1 + num2));

        // Close the Scanner object
        input.close();
    }
}
