// Program Name : Largest and Second Largest Digit
// Description  : Finds the largest and second largest digits from a given number

import java.util.Scanner; // Import Scanner class for user input

public class LargestAndSecondLargest
{
    public static void main (String[] args)
    {
        // Create Scanner object to read input
        Scanner input = new Scanner(System.in);
        
        // Ask user to enter a number
        System.out.println("Enter number: ");
        int number = input.nextInt();
        
        // Maximum digits allowed (for integer input)
        int maxDigit = 10;
        
        // Array to store digits of the number
        int[] array = new int[maxDigit];
        
        // Index to track number of digits stored
        int index = 0;
        
        // Extract digits from the number and store in array
        while (number != 0)
        {
            // Stop if array size limit is reached
            if (index == maxDigit)
            {
                break;
            }
            
            // Store last digit of the number
            array[index] = number % 10;
            
            // Remove last digit from the number
            number = number / 10;
            
            index++;			
        }	
        
        // Variables to store index of largest and second largest digits
        int largest = 0;
        int secondLargest = 0;
        
        // Find index of the largest digit
        for (int i = 1; i < index; i++)
        {
            if (array[i] > array[largest])
            {
                largest = i;
            }
        }
        
        // Display the largest digit
        System.out.println("Largest: " + array[largest]);
        
        // Find index of the second largest digit
        for (int i = 1; i < index; i++)
        {
            if (array[i] > array[secondLargest] && array[i] != array[largest])
            {
                secondLargest = i;
            }
        }
        
        // Display the second largest digit
        System.out.println("Second Largest: " + array[secondLargest]);
    }
}
