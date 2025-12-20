// Program Name : FriendsComparison
// Description  : Compares age and height of friends to find the youngest and tallest

import java.util.Scanner; // Import Scanner class for user input

public class FriendsComparison
{
    public static void main (String[] args)
    {
        // Create Scanner object to read input from user
        Scanner input = new Scanner(System.in);
        
        // Array to store names of friends
        String[] names = {"Amar", "Akbar", "Anthony"};
        
        // Arrays to store age and height of friends
        int[] age = new int[3];
        double[] height = new double[3];
        
        // Loop to take age and height input for each friend
        for (int i = 0; i < 3; i++)
        {
            // Input age of the friend
            System.out.println("Enter age of " + names[i]);
            age[i] = input.nextInt();
            
            // Input height of the friend
            System.out.println("Enter height of " + names[i]);
            height[i] = input.nextDouble();			
        }
        
        // Variables to store index of youngest and tallest friend
        int youngestIndex = 0;
        int tallestIndex = 0;
        
        // Loop to compare ages and heights
        for (int i = 1; i < 3; i++)
        {
            // Check for youngest friend
            if (age[i] < age[youngestIndex])
            {
                youngestIndex = i;
            }
            
            // Check for tallest friend
            if (height[i] > height[tallestIndex])
            {
                tallestIndex = i;
            }
        }

        // Display the youngest and tallest friends
        System.out.println("Youngest: " + names[youngestIndex]);
        System.out.println("Tallest: " + names[tallestIndex]);
    }
}
