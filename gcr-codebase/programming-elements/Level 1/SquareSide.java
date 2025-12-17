// Program to find side of a square using perimeter

import java.util.Scanner;

public class SquareSide
{
    public static void main(String args[])
    {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Read perimeter of the square
        double perimeter = input.nextDouble();

        // Calculate side of square
        double side = perimeter / 4;

        // Display result
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
    }
}
