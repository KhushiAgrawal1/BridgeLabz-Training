// Program Name : Character Frequency Using Nested Loops
// Description  : This program finds the frequency of each character
//                in a given string using nested loops. Duplicate
//                characters are marked as '0' to avoid recounting.
//                The result is stored and displayed using a 1D String array.

import java.util.Scanner;

public class CharacterFrequencyNestedLoop
{
    // Method to find character frequency using nested loops
    public static String[] findCharacterFrequency(String text)
    {
        // Convert string to character array
        char[] chars = text.toCharArray();

        // Array to store frequency of characters
        int[] freq = new int[chars.length];

        // Initialize frequency array
        for (int i = 0; i < chars.length; i++)
        {
            freq[i] = 1;

            // Inner loop to check duplicate characters
            for (int j = i + 1; j < chars.length; j++)
            {
                if (chars[i] == chars[j])
                {
                    freq[i]++;
                    chars[j] = '0'; // Mark duplicate as '0'
                }
            }
        }

        // Count unique characters
        int count = 0;
        for (int i = 0; i < chars.length; i++)
        {
            if (chars[i] != '0')
            {
                count++;
            }
        }

        // Create 1D String array to store result
        String[] result = new String[count];
        int index = 0;

        for (int i = 0; i < chars.length; i++)
        {
            if (chars[i] != '0')
            {
                result[index] = chars[i] + " : " + freq[i];
                index++;
            }
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
        String[] output = findCharacterFrequency(text);

        // Display result
        System.out.println("\nCharacter Frequency:");
        System.out.println("---------------------");
        for (int i = 0; i < output.length; i++)
        {
            System.out.println(output[i]);
        }
    }
}
