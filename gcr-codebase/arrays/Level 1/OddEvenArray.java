// Program Name : Odd and Even Numbers Program
// Description  : Stores odd and even numbers separately using arrays

import java.util.Scanner; // Import Scanner class for user input

public class 0ddEvenArray
{
    public static void main(String[] args)
    {
        // Create Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        // Ask user to enter a number
        System.out.println("Enter number:");
        int number = input.nextInt();
        
        // Check for invalid input (number should be natural number)
        if(number < 1)
        {
            System.out.println("Invalid input");
            return; // Exit the program if input is invalid
        }
        
        // Declare arrays to store even and odd numbers
        // Size is number/2 + 1 to ensure enough space
        int[] evenArray = new int[number / 2 + 1];
        int[] oddArray = new int[number / 2 + 1];
        
        // Index variables to track position in arrays
        int evenIndex = 0;
        int oddIndex = 0;
        
        // Loop from 1 to the entered number
        for (int i = 1; i <= number; i++)
        {
            // Check if number is even
            if(i % 2 == 0)
            {
                // Store even number in evenArray
                evenArray[evenIndex++] = i;
            }
            else
            {
                // Store odd number in oddArray
                oddArray[oddIndex++] = i;
            }	
        }
        
        // Display all odd numbers
        System.out.println("Odd Numbers:");
        for (int i = 0; i < oddIndex; i++)
        {
            System.out.println(oddArray[i] + " ");
        }

        // Display all even numbers
        System.out.println("Even Numbers:");
        for (int i = 0; i < evenIndex; i++)
        {
            System.out.print(evenArray[i] + " ");
        }
    }
}
