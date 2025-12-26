import java.util.Scanner; // Import Scanner class for user input

class PerimeterOfaRectangle {

    public static void main(String[] args) {

        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Ask the user to enter the length of the rectangle
        System.out.print("Enter length: ");
        double l = input.nextDouble();

        // Ask the user to enter the width of the rectangle
        System.out.print("Enter width: ");
        double w = input.nextDouble();

        // Calculate the perimeter of the rectangle
        double p = 2 * (l + w);

        // Display the perimeter
        System.out.println("Perimeter of Rectangle = " + p);

        // Close the Scanner object
        input.close();
    }
}
