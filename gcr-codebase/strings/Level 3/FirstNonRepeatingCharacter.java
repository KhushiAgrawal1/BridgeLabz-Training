// Program Name : First Non-Repeating Character Finder
// Description  : This program finds the first character in a string
//                that occurs only once using ASCII frequency counting
//                and the charAt() method.

import java.util.Scanner;

public class FirstNonRepeatingCharacter
{
    // Method to find first non-repeating character
    public static char findFirstNonRepeatingChar(String text)
    {
        int[] frequency = new int[256];   // ASCII character frequency array

        // Loop to count frequency of each character
        for (int i = 0; i < text.length(); i++)
        {
            char ch = text.charAt(i);
            frequency[ch]++;
        }

        // Loop to find first character with frequency 1
        for (int i = 0; i < text.length(); i++)
        {
            char ch = text.charAt(i);
            if (frequency[ch] == 1)
            {
                return ch;
            }
        }

        // If no non-repeating character found
        return '\0';
    }

    // Main method
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a string:");
        String text = input.nextLine();

        // Call method
        char result = findFirstNonRepeatingChar(text);

        // Display result
        if (result != '\0')
        {
            System.out.println("First non-repeating character: " + result);
        }
        else
        {
            System.out.println("No non-repeating character found.");
        }
    }
}
