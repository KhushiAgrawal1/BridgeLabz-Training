// Program Name : Smallest and Largest Number Program
// Description  : Finds the smallest and largest among three input numbers

import java.util.Scanner;

public class SmallestAndLargest
{
    // Method to find smallest and largest of three numbers
    public static int[] findSmallestAndLargest(int number1, int number2, int number3)
    {
        // Assume first number as smallest and largest
        int smallest = number1;
        int largest = number1;

        // Compare second number
        if (number2 < smallest)
            smallest = number2;

        if (number2 > largest)
            largest = number2;

        // Compare third number
        if (number3 < smallest)
            smallest = number3;

        if (number3 > largest)
            largest = number3;

        // Return smallest and largest values
        return new int[]{smallest, largest};
    }

    public static void main(String[] args)
    {
        // Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take three numbers from user
        System.out.print("Enter first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter second number: ");
        int number2 = input.nextInt();

        System.out.print("Enter third number: ");
        int number3 = input.nextInt();

        // Call method to find result
        int[] result = findSmallestAndLargest(number1, number2, number3);

        // Display output
        System.out.println("Smallest number: " + result[0]);
        System.out.println("Largest number: " + result[1]);
    }
}
