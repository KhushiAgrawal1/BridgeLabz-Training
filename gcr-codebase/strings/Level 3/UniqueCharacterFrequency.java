// Program Name : Character Frequency Using Unique Characters
// Description  : This program finds unique characters in a string using
//                nested loops and then calculates the frequency of each
//                unique character using an ASCII frequency array.

import java.util.Scanner;

public class UniqueCharacterFrequency
{
    // Method to find unique characters using nested loops and charAt()
    public static char[] uniqueCharacters(String text)
    {
        int length = text.length();
        char[] temp = new char[length];
        int count = 0;

        // Outer loop to read each character
        for (int i = 0; i < length; i++)
        {
            char ch = text.charAt(i);
            boolean isUnique = true;

            // Inner loop to check previous characters
            for (int j = 0; j < i; j++)
            {
                if (ch == text.charAt(j))
                {
                    isUnique = false;
                    break;
                }
            }

            // Store only unique characters
            if (isUnique)
            {
                temp[count] = ch;
                count++;
            }
        }

        // Create exact-sized array for unique characters
        char[] uniqueChars = new char[count];
        for (int i = 0; i < count; i++)
        {
            uniqueChars[i] = temp[i];
        }

        return uniqueChars;
    }

    // Method to find frequency using unique characters
    public static String[][] findCharacterFrequency(String text)
    {
        int[] frequency = new int[256]; // ASCII frequency array

        // Count frequency of all characters
        for (int i = 0; i < text.length(); i++)
        {
            frequency[text.charAt(i)]++;
        }

        // Get unique characters
        char[] uniqueChars = uniqueCharacters(text);

        // Create 2D array to store character and frequency
        String[][] result = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++)
        {
            char ch = uniqueChars[i];
            result[i][0] = String.valueOf(ch);
            result[i][1] = String.valueOf(frequency[ch]);
        }

        return result;
    }

    // Main method
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string:");
        String text = input.nextLine();

        // Call method
        String[][] output = findCharacterFrequency(text);

        // Display result
        System.out.println("\nCharacter\tFrequency");
        System.out.println("---------------------");

        for (int i = 0; i < output.length; i++)
        {
            System.out.println(output[i][0] + "\t\t" + output[i][1]);
        }
    }
}
