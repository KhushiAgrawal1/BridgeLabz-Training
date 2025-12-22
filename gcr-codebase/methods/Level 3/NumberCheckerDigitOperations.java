// Program Name : NumberChecker Utility Program (Digits Operations)
// Description  : This program performs various digit-based operations on a number
//                using static utility methods. It finds the count of digits, stores
//                digits in an array, calculates the sum of digits, sum of squares
//                of digits, checks whether the number is a Harshad number, and
//                finds the frequency of each digit using a 2D array.

import java.util.Scanner;

public class NumberCheckerDigitOperations
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

    // Method to find the sum of digits using digits array
    public static int sumOfDigits(int[] digits)
    {
        int sum = 0;

        for (int digit : digits)
        {
            sum += digit;
        }
        return sum;
    }

    // Method to find the sum of squares of digits using Math.pow()
    public static int sumOfSquaresOfDigits(int[] digits)
    {
        int sum = 0;

        for (int digit : digits)
        {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    // Method to check if the number is a Harshad Number
    // Harshad number: number divisible by sum of its digits
    public static boolean isHarshadNumber(int number, int[] digits)
    {
        int sum = sumOfDigits(digits);
        return number % sum == 0;
    }

    // Method to find frequency of each digit using 2D array
    public static int[][] digitFrequency(int[] digits)
    {
        int[][] frequency = new int[10][2];

        // Initialize digit column
        for (int i = 0; i < 10; i++)
        {
            frequency[i][0] = i;
            frequency[i][1] = 0;
        }

        // Count frequency
        for (int digit : digits)
        {
            frequency[digit][1]++;
        }

        return frequency;
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

        System.out.println("Sum of digits: " + sumOfDigits(digitsArray));
        System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(digitsArray));
        System.out.println("Is Harshad Number: " + isHarshadNumber(number, digitsArray));

        int[][] frequencyArray = digitFrequency(digitsArray);

        System.out.println("Digit Frequency:");
        System.out.println("Digit  Frequency");
        for (int i = 0; i < frequencyArray.length; i++)
        {
            if (frequencyArray[i][1] > 0)
            {
                System.out.println(frequencyArray[i][0] + "      " + frequencyArray[i][1]);
            }
        }
    }
}
