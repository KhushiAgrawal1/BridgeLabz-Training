import java.util.Scanner; // Import Scanner class for user input

public class AreaOfaCircle {

    public static void main(String[] args) {

        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Ask the user to enter the radius of the circle
        System.out.println("Enter radius of circle: ");

        // Read the radius value
        int radius = input.nextInt();

        // Calculate and display the area of the circle
        System.out.println("Area of Circle is : " + (3.14 * radius * radius));

        // Close the Scanner object
        input.close();
    }
}
