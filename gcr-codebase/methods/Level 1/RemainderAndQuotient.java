// Program Name : Remainder and Quotient Program
// Description  : Calculates quotient and remainder of two integers

import java.util.Scanner;

public class RemainderAndQuotient
{
    // Method to calculate quotient and remainder
    public static int[] findRemainderAndQuotient(int divident, int divisor)
    {
        // Calculate quotient
        int quotient = divident / divisor;

        // Calculate remainder
		int remainder = divident % divisor;
	   
        // Return quotient and remainder
        return new int[]{quotient, remainder};
    }

    public static void main(String[] args)
    {
        // Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take dividend input
        System.out.print("Enter divident: ");
        int divident = input.nextInt();

        // Take divisor input
        System.out.print("Enter divisor: ");
        int divisor = input.nextInt();

        // Call method to get result
        int[] result = findRemainderAndQuotient(divident, divisor);

        // Display output
        System.out.println("Quotient: " + result[0]);
        System.out.println("Remainder: " + result[1]);
    }
}
