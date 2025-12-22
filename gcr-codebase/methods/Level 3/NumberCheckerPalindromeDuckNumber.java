// Program Name : NumberChecker Utility Program (Palindrome & Duck Number)
// Description  : This program performs digit-based operations on a number using
//                static utility methods. It finds the count of digits, stores
//                digits in an array, reverses the digits array, compares two
//                arrays, checks whether the number is a Palindrome number, and
//                checks whether the number is a Duck number using the digits array.

import java.util.Scanner;

public class NumberCheckerPalindromeDuckNumber
{
    // Method to find the count of digits in a number
    public static int countDigits(int number)
    {
        int count = 0;

        while (number != 0)
        {
            count++;
            number = number / 10;
        }
        return count;
    }

    // Method to store digits of the number in an array
    public static int[] getDigitsArray(int number)
    {
        int count = countDigits(number);
        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--)
        {
            digits[i] = number % 10;
            number = number / 10;
        }
        return digits;
    }

    // Method to reverse the digits array
    public static int[] reverseDigitsArray(int[] digits)
    {
        int[] reversed = new int[digits.length];

        for (int i = 0; i < digits.length; i++)
        {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    // Method to compare two arrays and check if they are equal
    public static boolean compareArrays(int[] array1, int[] array2)
    {
        if (array1.length != array2.length)
        {
            return false;
        }

        for (int i = 0; i < array1.length; i++)
        {
            if (array1[i] != array2[i])
            {
                return false;
            }
        }
        return true;
    }

    // Method to check if the number is a Palindrome Number using digits array
    public static boolean isPalindrome(int[] digits)
    {
        int[] reversedDigits = reverseDigitsArray(digits);
        return compareArrays(digits, reversedDigits);
    }

    // Method to check if the number is a Duck Number
    // Duck number: number that contains at least one non-zero digit
    public static boolean isDuckNumber(int[] digits)
    {
        for (int digit : digits)
        {
            if (digit != 0)
            {
                return true;
            }
        }
        return false;
    }

    // Main method
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = input.nextInt();

        int digitCount = countDigits(number);
        int[] digitsArray = getDigitsArray(number);

        System.out.println("Count of digits: " + digitCount);

        System.out.print("Digits Array: ");
        for (int digit : digitsArray)
        {
            System.out.print(digit + " ");
        }
        System.out.println();

        int[] reversedArray = reverseDigitsArray(digitsArray);

        System.out.print("Reversed Digits Array: ");
        for (int digit : reversedArray)
        {
            System.out.print(digit + " ");
        }
        System.out.println();

        System.out.println("Arrays are equal: " + compareArrays(digitsArray, reversedArray));
        System.out.println("Is Palindrome Number: " + isPalindrome(digitsArray));
        System.out.println("Is Duck Number: " + isDuckNumber(digitsArray));
    }
}
