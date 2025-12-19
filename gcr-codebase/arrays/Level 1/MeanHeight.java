// Program Name : Mean Height Program
// Description  : Calculates the mean height of 11 football players

import java.util.Scanner; // Import Scanner class to take input from user

public class MeanHeight
{
    public static void main (String[] agrs)
    {
        // Create Scanner object to read input from keyboard
        Scanner input = new Scanner(System.in);
        
        // Declare an array to store heights of 11 players
        double[] heights = new double[11];
        
        // Variable to store the sum of all heights
        double sum = 0;
        
        // Loop to take height input for each player
        for (int i = 0; i < heights.length; i++)
        {
            // Prompt user to enter height of the current player
            System.out.println("Enter height of the player " + (i + 1));
            
            // Read height and store it in the array
            heights[i] = input.nextDouble();
            
            // Add height to sum
            sum += heights[i];		
        }
        
        // Calculate mean height
        double mean = sum / 11;
        
        // Display the mean height
        System.out.println("Mean Height = " + mean);		
    }
}
