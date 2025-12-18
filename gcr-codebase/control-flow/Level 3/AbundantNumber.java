// Program Name : Abundant Number Check Program
// Description  : This program checks whether a given number is an Abundant Number or not

import java.util.Scanner;

public class AbundantNumber
{
    public static void main(String[] args)
    {
        // Create Scanner object to take input
        Scanner input = new Scanner(System.in);

        // Get number from user
        System.out.println("Enter a number:");
        int number = input.nextInt();

        // Initialize sum variable
        int sum = 0;

        // Loop to find all divisors
        for (int i = 1; i < number; i++)
        {
            if (number % i == 0)
            {
                sum = sum + i;
            }
        }

        // Check if sum of divisors is greater than number
        if (sum > number)
        {
            System.out.println("Abundant Number");
        }
        else
        {
            System.out.println("Not an Abundant Number");
        }
    }
}
