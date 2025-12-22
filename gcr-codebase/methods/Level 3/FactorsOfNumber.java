// Program Name : Factors Utility Program
// Description  : This program finds all the factors of a given number and
//                performs various operations using the factors array. It
//                finds the greatest factor, sum of factors, product of
//                factors, and product of the cube of factors using static
//                utility methods.

import java.util.Scanner;

public class FactorsOfNumber
{
    // Method to find factors of a number and return them as an array
    public static int[] findFactors(int number)
    {
        int count = 0;

        // First loop to count factors
        for (int i = 1; i <= number; i++)
        {
            if (number % i == 0)
            {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;

        // Second loop to store factors in array
        for (int i = 1; i <= number; i++)
        {
            if (number % i == 0)
            {
                factors[index] = i;
                index++;
            }
        }

        return factors;
    }

    // Method to find the greatest factor using factors array
    public static int findGreatestFactor(int[] factors)
    {
        int greatest = factors[0];

        for (int factor : factors)
        {
            if (factor > greatest)
            {
                greatest = factor;
            }
        }
        return greatest;
    }

    // Method to find the sum of factors using factors array
    public static int sumOfFactors(int[] factors)
    {
        int sum = 0;

        for (int factor : factors)
        {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of factors using factors array
    public static long productOfFactors(int[] factors)
    {
        long product = 1;

        for (int factor : factors)
        {
            product *= factor;
        }
        return product;
    }

    // Method to find the product of the cube of factors
    // Uses Math.pow()
    public static double productOfCubeOfFactors(int[] factors)
    {
        double product = 1;

        for (int factor : factors)
        {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    // Main method
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = input.nextInt();

        int[] factorsArray = findFactors(number);

        System.out.print("Factors of the number: ");
        for (int factor : factorsArray)
        {
            System.out.print(factor + " ");
        }
        System.out.println();

        System.out.println("Greatest Factor: " + findGreatestFactor(factorsArray));
        System.out.println("Sum of Factors: " + sumOfFactors(factorsArray));
        System.out.println("Product of Factors: " + productOfFactors(factorsArray));
        System.out.println("Product of Cube of Factors: " + productOfCubeOfFactors(factorsArray));
    }
}
