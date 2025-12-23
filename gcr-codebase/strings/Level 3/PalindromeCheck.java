// Program Name : PalindromeCheck
// Description  : This program checks whether a given text is a palindrome.
//                It uses three different logics:
//                1. Comparing characters using loop (start & end index)
//                2. Comparing characters using recursion
//                3. Comparing original and reversed character arrays

import java.util.Scanner;

public class PalindromeCheck
{
    // Logic 1: Check palindrome using loop
    public static boolean checkPalindromeUsingLoop(String text)
    {
        int start = 0;
        int end = text.length() - 1;

        while (start < end)
        {
            if (text.charAt(start) != text.charAt(end))
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Check palindrome using recursion
    public static boolean checkPalindromeUsingRecursion(String text, int start, int end)
    {
        // Base condition
        if (start >= end)
        {
            return true;
        }

        // If characters do not match
        if (text.charAt(start) != text.charAt(end))
        {
            return false;
        }

        // Recursive call
        return checkPalindromeUsingRecursion(text, start + 1, end - 1);
    }

    // Logic 3 (Step 1): Reverse string using charAt()
    public static char[] reverseString(String text)
    {
        int length = text.length();
        char[] reverse = new char[length];
        int index = 0;

        for (int i = length - 1; i >= 0; i--)
        {
            reverse[index] = text.charAt(i);
            index++;
        }
        return reverse;
    }

    // Logic 3 (Step 2): Check palindrome using character arrays
    public static boolean checkPalindromeUsingArray(String text)
    {
        char[] original = text.toCharArray();
        char[] reverse = reverseString(text);

        for (int i = 0; i < original.length; i++)
        {
            if (original[i] != reverse[i])
            {
                return false;
            }
        }
        return true;
    }

    // Main method
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a text:");
        String text = input.nextLine();

        // Logic 1 result
        boolean result1 = checkPalindromeUsingLoop(text);

        // Logic 2 result
        boolean result2 = checkPalindromeUsingRecursion(text, 0, text.length() - 1);

        // Logic 3 result
        boolean result3 = checkPalindromeUsingArray(text);

        // Display results
        System.out.println("\nPalindrome Check Results:");

        System.out.println("Using Loop Method      : " + result1);
        System.out.println("Using Recursion Method : " + result2);
        System.out.println("Using Array Method     : " + result3);
    }
}
