// Program Name : Unique Characters Finder
// Description  : This program finds and displays unique characters
//                in a given string using the charAt() method
//                without using the built-in length() method.

import java.util.Scanner;

public class UniqueCharacters
{
    // Method to find length of string without using length()
    public static int findLength(String text)
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
        catch (Exception e)
        {
            // Exception occurs when index is out of range
        }

        return count;
    }

    // Method to find unique characters using charAt()
    public static char[] findUniqueCharacters(String text)
    {
        int length = findLength(text);

        // Temporary array to store possible unique characters
        char[] temp = new char[length];
        int uniqueCount = 0;

        // Outer loop to iterate through each character
        for (int i = 0; i < length; i++)
        {
            char current = text.charAt(i);
            boolean isUnique = true;

            // Inner loop to check if character appeared before
            for (int j = 0; j < i; j++)
            {
                if (text.charAt(j) == current)
                {
                    isUnique = false;
                    break;
                }
            }

            // Store unique character
            if (isUnique)
            {
                temp[uniqueCount] = current;
                uniqueCount++;
            }
        }

        // Create new array with exact size of unique characters
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++)
        {
            result[i] = temp[i];
        }

        return result;
    }

    // Main method
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a string:");
        String text = input.nextLine();

        // Find unique characters
        char[] uniqueChars = findUniqueCharacters(text);

        // Display result
        System.out.println("\nUnique Characters:");
        for (int i = 0; i < uniqueChars.length; i++)
        {
            System.out.print(uniqueChars[i] + " ");
        }
    }
}
