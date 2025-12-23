// Program Name : String Trim Without Built-in trim()
// Description  : This program trims leading and trailing spaces from a string
//                using the charAt() method. It compares the user-defined
//                trimmed string with the built-in trim() result.

import java.util.Scanner;

public class StringTrimChecker
{
    // Method to find start and end index after trimming spaces
    public static int[] findTrimIndexes(String text)
    {
        int start = 0;
        int end = text.length() - 1;

        // Trim leading spaces
        while (start <= end && text.charAt(start) == ' ')
        {
            start++;
        }

        // Trim trailing spaces
        while (end >= start && text.charAt(end) == ' ')
        {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create substring using charAt()
    public static String createSubstring(String text, int start, int end)
    {
        String result = "";

        for (int i = start; i <= end; i++)
        {
            result = result + text.charAt(i);
        }

        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2)
    {
        if (str1.length() != str2.length())
        {
            return false;
        }

        for (int i = 0; i < str1.length(); i++)
        {
            if (str1.charAt(i) != str2.charAt(i))
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

        // Take user input
        System.out.println("Enter a string with leading and trailing spaces:");
        String text = input.nextLine();

        // User-defined trim logic
        int[] indexes = findTrimIndexes(text);
        String trimmedText = createSubstring(text, indexes[0], indexes[1]);

        // Built-in trim
        String builtInTrim = text.trim();

        // Compare results
        boolean isSame = compareStrings(trimmedText, builtInTrim);

        // Display output
        System.out.println("\nTrimmed String (User Method): [" + trimmedText + "]");
        System.out.println("Trimmed String (Built-in):    [" + builtInTrim + "]");
        System.out.println("Are both strings equal? " + isSame);
    }
}
