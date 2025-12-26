import java.util.Scanner; // Import Scanner class for user input

class KilometersToMiles {

    public static void main(String[] args) {

        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Ask the user to enter distance in kilometers
        System.out.print("Enter distance in kilometers: ");
        double km = input.nextDouble();

        // Convert kilometers to miles
        double miles = km * 0.621371;

        // Display the distance in miles
        System.out.println("Miles = " + miles);

        // Close the Scanner object
        input.close();
    }
}
