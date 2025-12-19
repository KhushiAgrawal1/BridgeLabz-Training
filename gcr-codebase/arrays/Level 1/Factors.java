// Program name : Factors of a number
// Description  : Finds and stores factors dynamically using array resizing

import java.util.Scanner; // Import Scanner class for user input

public class Factors
{
    public static void main(String[] args)
    {
        // Create Scanner object to read input from user
        Scanner input = new Scanner(System.in);
        
        // Prompt user to enter a number
        System.out.println("Enter number:");
        int number = input.nextInt();
        
        // Initial size of the factors array
        int maxfactor = 10;
        
        // Array to store factors of the number
        int[] factors = new int[maxfactor];
        
        // Variable to track number of factors stored
        int index = 0;
        
        // Loop from 1 to the entered number
        for (int i = 1; i <= number; i++)
        {
            // Check if i is a factor of the number
            if(number % i == 0)
            {
                // If array is full, double its size
                if(index == maxfactor)
                {
                    maxfactor *= 2;
                    
                    // Create a temporary array with increased size
                    int[] temp = new int[maxfactor];
                    
                    // Copy existing factors to new array
                    for(int j = 0; j < index; j++)
                    {
                        temp[j] = factors[j];
                    }
                    
                    // Assign resized array back to factors
                    factors = temp;
                }	
                
                // Store the factor in the array
                factors[index++] = i;
            }
        }

        // Display all factors of the number
        System.out.println("Factors:");
        for (int i = 0; i < index; i++)
        {
            System.out.println(factors[i] + " ");
        }	
    }
}
