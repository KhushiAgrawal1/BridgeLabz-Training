// Program Name : Prime Number Check Program
// Description  : This program checks whether the given number is a Prime Number or not

import java.util.Scanner;

public class PrimeNumber
{
    public static void main(String[] args)
    {
        // Create Scanner object to take input
        Scanner input = new Scanner(System.in);

        // Ask user to enter a number
        System.out.println("Enter a number:");
        int number = input.nextInt();

        // Prime numbers are greater than 1
        boolean isPrime = true;

        if (number <= 1)
        {
            isPrime = false;
        }
        else
        {
            // Loop from 2 to number - 1
            for (int i = 2; i < number; i++)
            {
                // If number is divisible by any other number
                if (number % i == 0)
                {
                    isPrime = false;
                    break;
                }
            }
        }

        // Print result
        if (isPrime)
        {
            System.out.println("Number is a Prime Number");
        }
        else
        {
            System.out.println("Number is not a Prime Number");
        }
    }
}
