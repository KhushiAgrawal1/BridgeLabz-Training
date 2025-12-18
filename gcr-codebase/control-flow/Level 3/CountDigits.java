// Program Name : Count Number of Digits Program
// Description  : This program counts the number of digits present in a given integer number

import java.util.Scanner;

public class CountDigits
{
    public static void main(String[] args)
    {
        // Create Scanner object to take input
        Scanner input = new Scanner(System.in);

        // Get number from user
        System.out.println("Enter a number:");
        int number = input.nextInt();

        // Initialize count variable
        int count = 0;

        // Loop until number becomes 0
        while (number != 0)
        {
            // Remove last digit of the number
            number = number / 10;

            // Increase digit count
            count++;
        }

        // Display the number of digits
        System.out.println("Number of digits = " + count);
    }
}
