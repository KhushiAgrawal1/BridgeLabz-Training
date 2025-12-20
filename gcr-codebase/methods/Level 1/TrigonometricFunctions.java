// Program Name : Trigonometric Functions Program
// Description  : Calculates sine, cosine and tangent of a given angle

import java.util.Scanner;

public class TrigonometricFunctions
{
    // Method to calculate sine, cosine and tangent
    public static double[] calculateTrigonometricFunctions(double angle)
    {
        // Convert angle from degrees to radians
        double radians = Math.toRadians(angle);

        // Calculate trigonometric values
        double sin = Math.sin(radians);
        double cos = Math.cos(radians);
        double tan = Math.tan(radians);

        // Return results as array
        return new double[]{sin, cos, tan};
    }

    public static void main(String[] args)
    {
        // Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take angle input in degrees
        System.out.print("Enter angle in degrees: ");
        double angle = input.nextDouble();

        // Call method to calculate values
        double[] result = calculateTrigonometricFunctions(angle);

        // Display results
        System.out.println("Sine: " + result[0]);
        System.out.println("Cosine: " + result[1]);
        System.out.println("Tangent: " + result[2]);
    }
}
