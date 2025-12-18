// Program Name : Armstrong Number Check Program
// Description  : This program checks whether a given number is an Armstrong Number or not
// Example      : 153 = 1^3 + 5^3 + 3^3

import java.util.Scanner;

public class ArmstrongNumber
{
    public static void main(String[] args)
    {
        // Create Scanner object to take input
        Scanner input = new Scanner(System.in);

        // Get number from user
        System.out.println("Enter a number:");
        int number = input.nextInt();

        // Initialize variables
        int sum = 0;
        int originalNumber = number;

        // Loop until originalNumber becomes 0
        while (originalNumber != 0)
        {
            // Find last digit using modulus
            int digit = originalNumber % 10;

            // Find cube of the digit and add to sum
            sum = sum + (digit * digit * digit);

            // Remove last digit using division
            originalNumber = originalNumber / 10;
        }

        // Check if sum is equal to the original number
        if (sum == number)
        {
            System.out.println("Number is an Armstrong Number");
        }
        else
        {
            System.out.println("Number is not an Armstrong Number");
        }
    }
}
