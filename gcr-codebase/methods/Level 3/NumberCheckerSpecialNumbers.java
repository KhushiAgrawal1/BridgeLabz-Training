// Program Name : NumberChecker Utility Program (Special Numbers)
// Description  : This program checks whether a given number is a Prime number,
//                Neon number, Spy number, Automorphic number, and Buzz number
//                using static utility methods. All methods are called from
//                the main() method and the results are displayed.

import java.util.Scanner;

public class NumberCheckerSpecialNumbers
{
    // Method to check if a number is a Prime Number
    public static boolean isPrime(int number)
    {
        if (number <= 1)
        {
            return false;
        }

        for (int i = 2; i <= number / 2; i++)
        {
            if (number % i == 0)
            {
                return false;
            }
        }
        return true;
    }

    // Method to check if a number is a Neon Number
    // Neon number: sum of digits of square of the number equals the number
    public static boolean isNeonNumber(int number)
    {
        int square = number * number;
        int sum = 0;

        while (square != 0)
        {
            sum += square % 10;
            square = square / 10;
        }
        return sum == number;
    }

    // Method to check if a number is a Spy Number
    // Spy number: sum of digits equals product of digits
    public static boolean isSpyNumber(int number)
    {
        int sum = 0;
        int product = 1;
        int temp = number;

        while (temp != 0)
        {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp = temp / 10;
        }
        return sum == product;
    }

    // Method to check if a number is an Automorphic Number
    // Automorphic number: square ends with the number itself
    public static boolean isAutomorphicNumber(int number)
    {
        int square = number * number;
        return String.valueOf(square).endsWith(String.valueOf(number));
    }

    // Method to check if a number is a Buzz Number
    // Buzz number: divisible by 7 or ends with 7
    public static boolean isBuzzNumber(int number)
    {
        return (number % 7 == 0) || (number % 10 == 7);
    }

    // Main method
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = input.nextInt();

        System.out.println("Is Prime Number: " + isPrime(number));
        System.out.println("Is Neon Number: " + isNeonNumber(number));
        System.out.println("Is Spy Number: " + isSpyNumber(number));
        System.out.println("Is Automorphic Number: " + isAutomorphicNumber(number));
        System.out.println("Is Buzz Number: " + isBuzzNumber(number));
    }
}
