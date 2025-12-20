// Program Name : Number Analysis Program
// Description  : Checks number type and compares first and last elements

import java.util.Scanner;

public class NumberAnalysis
{
    public static void main(String[] args)
    {
        // Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Array to store 5 numbers
        int[] numbers = new int[5];

        // Loop to take input values
        for (int i = 0; i < numbers.length; i++)
        {
            System.out.println("Enter number " + (i + 1));
            numbers[i] = input.nextInt();
        }

        // Loop to analyze each number
        for (int i = 0; i < numbers.length; i++)
        {
            // Check if number is positive
            if (numbers[i] > 0)
            {
                // Check even or odd
                if (numbers[i] % 2 == 0)
                {
                    System.out.println(numbers[i] + " is Positive and Even");
                }
                else
                {
                    System.out.println(numbers[i] + " is Positive and Odd");
                }
            }
            // Check if number is negative
            else if (numbers[i] < 0)
            {
                System.out.println(numbers[i] + " is Negative");
            }
            // Number is zero
            else
            {
                System.out.println("Number is Zero");
            }
        }

        // Compare first and last elements of the array
        if (numbers[0] == numbers[4])
        {
            System.out.println("First and Last elements are Equal");
        }
        else if (numbers[0] > numbers[4])
        {
            System.out.println("First element is Greater");
        }
        else
        {
            System.out.println("Last element is Greater");
        }
    }
}
