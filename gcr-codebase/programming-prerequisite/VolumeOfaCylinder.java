import java.util.Scanner; // Import Scanner class for user input

public class VolumeOfaCylinder {

    public static void main(String[] args) {

        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Ask the user to enter the radius of the cylinder
        System.out.println("Enter radius of cylinder: ");
        double radius = input.nextDouble();

        // Ask the user to enter the height of the cylinder
        System.out.println("Enter height of cylinder: ");
        double height = input.nextDouble();

        // Calculate the volume of the cylinder
        double volume = 3.14 * radius * radius * height;

        // Display the volume
        System.out.println("Volume of Cylinder is : " + volume);

        // Close the Scanner object
        input.close();
    }
}
