// Program Name : Number Checker Program
// Description  : Checks whether a number is positive, negative or zero

import java.util.Scanner;

public class NumberChecker
{
    // Method to check whether number is positive, negative or zero
    public static int checkNumber(int number)  
    {
        // Return -1 for negative number
		if (number < 0)
		    return -1;

        // Return 1 for positive number
        else if (number > 0)
            return 1;

        // Return 0 for zero
		else
		    return 0;
    }
	
    public static void main(String[] args)
    {
        // Scanner object for user input
	    Scanner input = new Scanner(System.in);
	
        // Take number input
		System.out.println("Enter number");
		int number = input.nextInt();
		
        // Display result
		System.out.println(checkNumber(number));
    }
}
