// Program to find side of a square

import java.util.Scanner;

public class SquareSide
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        // Read perimeter
        double perimeter = input.nextDouble();

        // Calculate side
        double side = perimeter / 4;

        // Display result
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
    }
}
