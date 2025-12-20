// Program Name : Sum of Natural Numbers
// Description  : This program calculates the sum of natural numbers up to a given number using both recursion and formula.

import java.util.Scanner; // Import Scanner class for user input

public class SumOfNaturalNumbers
{
    // Recursive method to calculate sum of natural numbers
    public static int recursiveSum(int number)
    {
        if (number == 0)
        {
            return 0; // Base case: sum of 0 is 0
        }
        return number + recursiveSum(number - 1); // Recursive call
    }

    // Method to calculate sum using formula
    public static int formulaSum(int number)
    {
        return number * (number + 1) / 2; // Sum formula: n*(n+1)/2
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); // Scanner object for user input

        System.out.print("Enter number: ");
        int number = input.nextInt(); // Read number input

        // Validate input
        if (number <= 0)
        {
            System.out.println("Enter valid natural number");
            return; // Exit program for invalid input
        }

        // Calculate sum using recursion and formula
        int recSum = recursiveSum(number);
        int forSum = formulaSum(number);

        // Display results
        System.out.println("Recursive sum = " + recSum);
        System.out.println("Formula sum = " + forSum);

        // Verify both methods produce same result
        if (recSum == forSum)
        {
            System.out.println("Both results are correct");
        }
        else
        {
            System.out.println("Results are not matching");
        }

        input.close(); // Close Scanner
    }
}
