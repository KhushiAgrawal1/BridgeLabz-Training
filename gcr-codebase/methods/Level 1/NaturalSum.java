// Program Name : Natural Numbers Sum Program
// Description  : Calculates the sum of first N natural numbers

import java.util.Scanner;

public class NaturalSum
{
    // Method to find sum of natural numbers
    public static int findSum(int number)  
    {
        // Variable to store sum
		int sum = 0;

        // Loop from 1 to given number
	    for (int i = 1; i <= number; i++)
		{
			sum += i;
		}

        // Return calculated sum
		return sum;		
    }

    public static void main(String[] args)
    {
        // Scanner object for user input
	    Scanner input = new Scanner(System.in);
	
        // Take integer input
		System.out.println("Enter integer number");
		int number = input.nextInt();
		
        // Display sum result
		System.out.println("Sum is: " + findSum(number));
    }
}
