// Program Name : Largest and Second Largest Digit (Dynamic)
// Description  : Finds the largest and second largest digits of a number
//                using a dynamically growing array

import java.util.Scanner; // Import Scanner class for user input

public class LargestAndSecondLargestDynamic
{
    public static void main (String[] args)
    {
        // Create Scanner object to read input
        Scanner input = new Scanner(System.in);
        
        // Ask user to enter a number
        System.out.println("Enter number: ");
        int number = input.nextInt();
        
        // Initial size of digit array
        int maxDigit = 10;
        
        // Array to store digits dynamically
        int[] array = new int[maxDigit];
        
        // Index to track number of digits stored
        int index = 0;
        
        // Extract digits from the number
        while (number != 0)
        {
            // If array is full, increase its size
            if (index == maxDigit)
            {
                maxDigit += 10;
                
                // Create a temporary array with increased size
                int[] temp = new int[maxDigit];
                
                // Copy existing digits to new array
                for (int i = 0; i < index; i++)
                {
                    temp[i] = array[i];
                }
                
                // Assign resized array back
                array = temp;
            }
            
            // Store last digit of the number
            array[index] = number % 10;
            
            // Remove last digit
            number = number / 10;
            
            index++;			
        }	
        
        // Variables to store index of largest and second largest digits
        int largest = 0;
        int secondLargest = 0;
        
        // Find the index of the largest digit
        for (int i = 1; i < index; i++)
        {
            if (array[i] > array[largest])
            {
                largest = i;
            }
        }
        
        // Display the largest digit
        System.out.println("Largest: " + array[largest]);
        
        // Find the index of the second largest digit
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
