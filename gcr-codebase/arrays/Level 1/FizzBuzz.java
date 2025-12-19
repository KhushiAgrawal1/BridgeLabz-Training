// Program name : FizzBuzz Program
// Description  : Implements FizzBuzz logic using an array

import java.util.Scanner; // Import Scanner class for user input

public class FizzBuzz
{
    public static void main(String[] args)
    {
        // Create Scanner object to read input from user
        Scanner input = new Scanner(System.in);
            
        // Prompt user to enter a number
        System.out.println("Enter number:");
        int number = input.nextInt();
        
        // Declare a String array to store FizzBuzz results
        int size = number + 1;
        String[] result = new String[size];
        
        // Loop from 0 to the entered number
        for (int i = 0; i <= number; i++)
        {	
            // Check if number is divisible by both 3 and 5
            if (i % 3 == 0 && i % 5 == 0)
            {	
                result[i] = "FizzBuzz";
            }
            // Check if number is divisible by 3
            else if(i % 3 == 0)
            {
                result[i] = "Fizz";
            }
            // Check if number is divisible by 5
            else if(i % 5 == 0)
            {
                result[i] = "Buzz";
            }
            // If none of the above, store the number as String
            else
            {
                result[i] = String.valueOf(i);
            }
        }	
        
        // Display the FizzBuzz result stored in the array
        for (int i = 0; i <= number; i++)
        {
            System.out.println("Position " + i + " = " + result[i]);
        }	
    }
}
