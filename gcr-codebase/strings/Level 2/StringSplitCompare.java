// Program Name : String Split and Compare Program
// Description  : This program splits a given text into words without using
//                the built-in split() method. It uses charAt() to identify
//                spaces, extracts words manually, compares the result with
//                the built-in split() method, and displays whether both
//                results are the same.

import java.util.Scanner;

public class StringSplitCompare
{
    // Method to find length of a string without using length()
    public static int findStringLength(String text)
    {
        int count = 0;
        try
        {
            while (true)
            {
                text.charAt(count);
                count++;
            }
        }
        catch (StringIndexOutOfBoundsException e)
        {
            return count;
        }
    }

    // Method to split text into words without using split()
    public static String[] splitTextManually(String text)
    {
        int length = findStringLength(text);
        int wordCount = 1;

        // Count number of words by counting spaces
        for (int i = 0; i < length; i++)
        {
            if (text.charAt(i) == ' ')
            {
                wordCount++;
            }
        }

        // Store indexes of spaces
        int[] spaceIndex = new int[wordCount + 1];
        int index = 0;
        spaceIndex[index++] = -1;

        for (int i = 0; i < length; i++)
        {
            if (text.charAt(i) == ' ')
            {
                spaceIndex[index++] = i;
            }
        }
        spaceIndex[index] = length;

        // Extract words using space indexes
        String[] words = new String[wordCount];

        for (int i = 0; i < wordCount; i++)
        {
            words[i] = text.substring(spaceIndex[i] + 1, spaceIndex[i + 1]);
        }

        return words;
    }

    // Method to compare two string arrays
    public static boolean compareStringArrays(String[] arr1, String[] arr2)
    {
        if (arr1.length != arr2.length)
        {
            return false;
        }

        for (int i = 0; i < arr1.length; i++)
        {
            if (!arr1[i].equals(arr2[i]))
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

        // Take input using nextLine()
        System.out.println("Enter a sentence:");
        String text = input.nextLine();

        // Split using user-defined method
        String[] manualSplit = splitTextManually(text);

        // Split using built-in split() method
        String[] builtInSplit = text.split(" ");

        // Display manually split words
        System.out.println("\nWords using manual split:");
        for (String word : manualSplit)
        {
            System.out.println(word);
        }

        // Display built-in split words
        System.out.println("\nWords using built-in split():");
        for (String word : builtInSplit)
        {
            System.out.println(word);
        }

        // Compare both results
        boolean result = compareStringArrays(manualSplit, builtInSplit);
        System.out.println("\nAre both split results equal? : " + result);
    }
}
