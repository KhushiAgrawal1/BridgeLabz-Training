// Program Name : Number of Rounds Program
// Description  : Calculates number of rounds to complete 5000 meters track

import java.util.Scanner;  

public class NumberOfRounds
{
    // Method to calculate number of rounds
    public static double calculateRounds(double side1, double side2, double side3)  
    {
        // Calculate perimeter of the triangle
	    double perimeter = side1 + side2 + side3;

        // Total rounds = 5000 meters / perimeter
        return 5000 / perimeter;
    }

    public static void main(String[] args)
    {
        // Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take first side length
        System.out.println("Enter side 1 (in meters): ");
        double side1 = input.nextDouble();

		// Take second side length
		System.out.println("Enter side 2 (in meters): ");
        double side2 = input.nextDouble();
		
		// Take third side length
		System.out.println("Enter side 3 (in meters): ");
        double side3 = input.nextDouble();
		
        // Call method to calculate total rounds
        double rounds = calculateRounds(side1, side2, side3);

        // Display result
        System.out.println("Total rounds: " + rounds);
    }
}
