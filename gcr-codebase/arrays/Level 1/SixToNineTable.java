// Program Name : Multiplication Table ( 6 to 9 )
// Description  : Displays multiplication table from 6 to 9

import java.util.Scanner;

public class SixToNineTable
{
    public static void main (String[] args)
	{
	    // Scanner object for user input
	    Scanner input = new Scanner(System.in);
		
		// Ask user to enter a number
		System.out.println("Enter Number:");
		int number = input.nextInt();
		
		// Array to store multiplication results
		int[] result = new int[4];
		
		// Index for array position
		int index = 0;

		// Loop from 6 to 9
		for (int i = 6; i <= 9; i++)
		{
			// Store multiplication result
			result[index] = number * i;

			// Display multiplication table
			System.out.println(number + " * " + i + " = " + result[index]);

			// Move to next index
			index++;
		}			
	}
}
