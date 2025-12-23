// Program Name : Character Frequency Counter
// Description  : This program finds the frequency of each character
//                in a given string using the charAt() method and
//                displays the result.

import java.util.Scanner;

public class CharacterFrequency
{
    // Method to find character frequencies and return as 2D array
    public static String[][] findCharacterFrequency(String text)
    {
        int[] frequency = new int[256];   // ASCII frequency array

        // Count frequency of each character
        for (int i = 0; i < text.length(); i++)
        {
            char ch = text.charAt(i);
            frequency[ch]++;
        }

        // Count unique characters
        int uniqueCount = 0;
        for (int i = 0; i < text.length(); i++)
        {
            if (frequency[text.charAt(i)] != -1)
            {
                uniqueCount++;
                frequency[text.charAt(i)] = -1; // mark as counted
            }
        }

        // Recalculate frequency (since marked)
        frequency = new int[256];
        for (int i = 0; i < text.length(); i++)
        {
            frequency[text.charAt(i)]++;
        }

        // Create 2D array for characters and frequencies
        String[][] result = new String[uniqueCount][2];
        int index = 0;

        for (int i = 0; i < text.length(); i++)
        {
            char ch = text.charAt(i);

            if (frequency[ch] != 0)
            {
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(frequency[ch]);
                index++;
                frequency[ch] = 0; // prevent duplicate entry
            }
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

        // Call method
        String[][] frequencies = findCharacterFrequency(text);

        // Display result
        System.out.println("\nCharacter\tFrequency");
        System.out.println("---------------------");

        for (int i = 0; i < frequencies.length; i++)
        {
            System.out.println(frequencies[i][0] + "\t\t" + frequencies[i][1]);
        }
    }
}
