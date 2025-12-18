// Program Name : Harshad Number Check Program
// Description  : This program checks whether a given number is a Harshad Number or not

import java.util.Scanner;

public class HarshadNumber
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
        int temp = number;

        // Loop to calculate sum of digits
        while (temp != 0)
        {
            int digit = temp % 10;
            sum = sum + digit;
            temp = temp / 10;
        }

        // Check if number is divisible by sum of digits
        if (number % sum == 0)
        {
            System.out.println("Harshad Number");
        }
        else
        {
            System.out.println("Not a Harshad Number");
        }
    }
}
