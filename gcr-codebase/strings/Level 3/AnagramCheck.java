// Program Name : AnagramCheck
// Description  : This program checks whether two given texts are anagrams.
//                An anagram is formed by rearranging the same letters.
//                The program uses character frequency comparison to check anagrams.

import java.util.Scanner;

public class AnagramCheck
{
    // Method to check if two texts are anagrams
    public static boolean areAnagrams(String text1, String text2)
    {
        // Step 1: Check if lengths are equal
        if (text1.length() != text2.length())
        {
            return false;
        }

        // Step 2: Create frequency arrays for ASCII characters
        int[] freq1 = new int[256];
        int[] freq2 = new int[256];

        // Step 3: Find frequency of characters in first text
        for (int i = 0; i < text1.length(); i++)
        {
            char ch = text1.charAt(i);
            freq1[ch]++;
        }

        // Step 4: Find frequency of characters in second text
        for (int i = 0; i < text2.length(); i++)
        {
            char ch = text2.charAt(i);
            freq2[ch]++;
        }

        // Step 5: Compare frequencies
        for (int i = 0; i < 256; i++)
        {
            if (freq1[i] != freq2[i])
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

        System.out.println("Enter first text:");
        String text1 = input.nextLine();

        System.out.println("Enter second text:");
        String text2 = input.nextLine();

        boolean result = areAnagrams(text1, text2);

        if (result)
        {
            System.out.println("The given texts are ANAGRAMS.");
        }
        else
        {
            System.out.println("The given texts are NOT ANAGRAMS.");
        }
    }
}
