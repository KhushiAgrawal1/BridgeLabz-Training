// Program name : 2D to 1D Array Copy
// Description  : Copies elements of a 2D array into a 1D array

import java.util.Scanner; // Import Scanner class for user input

public class TwoDToOne
{
    public static void main(String[] args)
    {
        // Create Scanner object to read input values
        Scanner input = new Scanner(System.in);
            
        // Ask user to enter number of rows
        System.out.println("Enter rows:");
        int rows = input.nextInt();
        
        // Ask user to enter number of columns
        System.out.println("Enter columns:");
        int columns = input.nextInt();
        
        // Declare 2D array (matrix) with given rows and columns
        int[][] matrix = new int[rows][columns];
        
        // Declare 1D array to store elements of 2D array
        int[] array = new int[rows * columns];
        
        // Index variable for 1D array
        int index = 0;
        
        // Loop to read elements into 2D array and copy them into 1D array
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                // Read element for matrix
                matrix[i][j] = input.nextInt();
                
                // Copy element to 1D array
                array[index++] = matrix[i][j];				
            }	
        }
        
        // Display elements of the 1D array
        System.out.println("1D Array:");
        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i] + " ");
        }	
    }
}
