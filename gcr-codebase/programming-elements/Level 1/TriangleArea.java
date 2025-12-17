import java.util.Scanner;

// Program to calculate area of a triangle

public class TriangleArea
{
    public static void main(String args[])
    {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Read base and height
        double base = input.nextDouble();
        double height = input.nextDouble();

        // Calculate area in square centimeters (cm^2)
        double areaCm = 0.5 * base * height;

        // Convert area to square inches (1 inch = 2.54 cm)
        double areaInch = areaCm / (2.54 * 2.54);

        // Display result
        System.out.println("The area of triangle in square centimeters is " + areaCm + " and in square inches is " + areaInch );   
    }
}