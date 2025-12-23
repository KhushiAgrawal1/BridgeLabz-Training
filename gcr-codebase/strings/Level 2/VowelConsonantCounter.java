// Program Name : Vowel and Consonant Counter
// Description  : This program checks each character of a string to determine
//                whether it is a vowel, consonant, or not a letter using ASCII
//                values. It counts and displays the total number of vowels
//                and consonants in the given string.

import java.util.Scanner;

public class VowelConsonantCounter
{
    // Method to check if a character is Vowel, Consonant or Not a Letter
    public static String checkCharacter(char ch)
    {
        // Convert uppercase letter to lowercase using ASCII values
        if (ch >= 'A' && ch <= 'Z')
        {
            ch = (char)(ch + 32);
        }

        // Check if character is a letter
        if (ch >= 'a' && ch <= 'z')
        {
            // Check for vowels
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                return "Vowel";
            }
            else
            {
                return "Consonant";
            }
        }

        // If character is not a letter
        return "Not a Letter";
    }

    // Method to find vowels and consonants using charAt()
    // Returns array: index 0 = vowel count, index 1 = consonant count
    public static int[] findVowelsAndConsonants(String text)
    {
        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < text.length(); i++)
        {
            char ch = text.charAt(i);
            String result = checkCharacter(ch);

            if (result.equals("Vowel"))
            {
                vowelCount++;
            }
            else if (result.equals("Consonant"))
            {
                consonantCount++;
            }
        }

        return new int[] { vowelCount, consonantCount };
    }

    // Main method
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a string:");
        String text = input.nextLine();

        // Call method to find vowel and consonant count
        int[] count = findVowelsAndConsonants(text);

        // Display result
        System.out.println("\nVowel Count      : " + count[0]);
        System.out.println("Consonant Count : " + count[1]);
    }
}
