// Program Name : NumberChecker Utility Program (Divisor & Strong Number)
// Description  : This program checks whether a given number is a Perfect number,
//                Abundant number, Deficient number, and Strong number using
//                static utility methods. All methods are called from the main()
//                method and the results are displayed.

import java.util.Scanner;

public class NumberCheckerDivisorStrongNumber
{
    // Method to find sum of proper divisors of a number
    public static int sumOfProperDivisors(int number)
    {
        int sum = 0;

        for (int i = 1; i <= number / 2; i++)
        {
            if (number % i == 0)
            {
                sum += i;
            }
        }
        return sum;
    }

    // Method to check if a number is a Perfect Number
    public static boolean isPerfectNumber(int number)
    {
        return sumOfProperDivisors(number) == number;
    }

    // Method to check if a number is an Abundant Number
    public static boolean isAbundantNumber(int number)
    {
        return sumOfProperDivisors(number) > number;
    }

    // Method to check if a number is a Deficient Number
    public static boolean isDeficientNumber(int number)
    {
        return sumOfProperDivisors(number) < number;
    }

    // Method to find factorial of a digit
    public static int factorial(int digit)
    {
        int fact = 1;

        for (int i = 1; i <= digit; i++)
        {
            fact *= i;
        }
        return fact;
    }

    // Method to check if a number is a Strong Number
    // Strong number: sum of factorial of digits equals the number
    public static boolean isStrongNumber(int number)
    {
        int temp = number;
        int sum = 0;

        while (temp != 0)
        {
            int digit = temp % 10;
            sum += factorial(digit);
            temp = temp / 10;
        }
        return sum == number;
    }

    // Main method
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = input.nextInt();

        System.out.println("Is Perfect Number: " + isPerfectNumber(number));
        System.out.println("Is Abundant Number: " + isAbundantNumber(number));
        System.out.println("Is Deficient Number: " + isDeficientNumber(number));
        System.out.println("Is Strong Number: " + isStrongNumber(number));
    }
}
