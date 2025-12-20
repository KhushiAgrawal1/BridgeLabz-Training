// Program Name : Factors Of Numbers
// Description  : Finds factors of a number and calculates
//                sum, product, and sum of squares of factors

import java.util.Scanner; // Import Scanner class for user input

public class FactorsOfNumbers
{
    // Method to find all factors of a given number
    public static int[] findFactors(int number)
    {
        int count = 0;
        
        // Count number of factors
        for (int i = 1; i <= number; i++)
        {
            if (number % i == 0)
            {
                count++;
            }
        }
        
        // Create array to store factors
        int[] factorsArray = new int[count];
        int index = 0;
        
        // Store factors in array
        for (int i = 1; i <= number; i++)
        {
            if (number % i == 0)
            {
                factorsArray[index] = i;
                index++;
            }
        }
        
        return factorsArray;    
    }
    
    // Method to find sum of factors
    public static int findSumOfFactors(int[] factors)
    {
        int sum = 0;		
        for (int value : factors)
        {
            sum += value;			
        }
        return sum; 				
    }
    
    // Method to find product of factors
    public static long findProductOfFactors(int[] factors)
    {
        long product = 1;		
        for (int value : factors)
        {
            product *= value;			
        }
        return product;
    }
    
    // Method to find sum of squares of factors
    public static double findSumOfSquaresOfFactors(int[] factors)
    {
        double sumOfSquares = 0;		
        for (int value : factors)
        {
            sumOfSquares += Math.pow(value, 2);			
        }
        return sumOfSquares;   
    }	
	
    public static void main(String[] args)
    {
        // Create Scanner object to read input
        Scanner input = new Scanner(System.in);
        
        // Ask user to enter a number
        System.out.println("Enter number:");
        int number = input.nextInt();
        
        // Find factors of the number
        int[] factors = findFactors(number);
        
        // Display factors
        System.out.println("Factors are: ");
        for (int i : factors)
        { 
            System.out.println(i + " ");
        }
        
        // Display calculated results
        System.out.println("Sum of factors: " + findSumOfFactors(factors));
        System.out.println("Product of factors: " + findProductOfFactors(factors));
        System.out.println("Sum of squares of factors: " + findSumOfSquaresOfFactors(factors));
    }
}
