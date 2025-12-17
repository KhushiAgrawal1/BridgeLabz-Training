import java.util.Scanner;

// Program to calculate area of a triangle

public class TriangleArea
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        // Read base and height in cm
        double base = input.nextDouble();
        double height = input.nextDouble();

        // Area in square centimeters
        double areaSqCm = 0.5 * base * height;

        // Convert to square inches
        double areaSqIn = areaSqCm / (2.54 * 2.54);

        // Display result
        System.out.println("The Area of the triangle in sq in is " + areaSqIn + " and sq cm is " + areaSqCm );      
    }
}
