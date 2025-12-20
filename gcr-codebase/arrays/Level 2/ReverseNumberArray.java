// Program Name : Reverse Number Using Array
// Description  : Reverses a given number by storing its digits in an array

import java.util.Scanner; // Import Scanner class for user input

public class ReverseNumberArray
{
    public static void main (String[] args)
    {
        // Create Scanner object to read input
        Scanner input = new Scanner(System.in);
        
        // Ask user to enter a number
        System.out.println("Enter number: ");
        int number = input.nextInt();
        
        // Temporary variable to preserve original number
        int temp = number;
        
        // Variable to count number of digits
        int count = 0;
        
        // Count the digits in the number
        while (temp != 0)             
        {    
            count++; 
            temp = temp / 10; // Remove last digit
        }
        
        // Array to store digits of the number
        int[] array = new int[count];
        temp = number;
        
        // Store digits of the number into array
        for (int i = 0; i < count; i++)  
        {
            array[i] = temp % 10;   // Extract last digit
            temp /= 10;             // Remove last digit
        }
        
        // Array to store reversed number
        int[] reverseArray = new int[count];
        
        // Copy digits into reverse array
        for (int i = 0; i < count; i++)
        {	
            reverseArray[i] = array[i];
        }

        // Display reversed number
        for (int i = 0; i < count; i++)
        {	
            System.out.println(reverseArray[i] + " ");
        }
    }
}
