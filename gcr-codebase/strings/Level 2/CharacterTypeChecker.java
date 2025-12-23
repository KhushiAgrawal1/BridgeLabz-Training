// Program Name : Character Type Identifier
// Description  : This program checks each character in a string and
//                identifies whether it is a Vowel, Consonant, or Not a Letter.
//                The result is stored in a 2D String array and displayed
//                in tabular format.

import java.util.Scanner;

public class CharacterTypeChecker
{
    // Method to check character type
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

        // Character is not a letter
        return "Not a Letter";
    }

    // Method to find vowels and consonants using charAt()
    // Returns 2D array containing character and its type
    public static String[][] findCharacterTypes(String text)
    {
        String[][] result = new String[text.length()][2];

        for (int i = 0; i < text.length(); i++)
        {
            char ch = text.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharacter(ch);
        }

        return result;
    }

    // Method to display 2D array in tabular format
    public static void displayResult(String[][] data)
    {
        System.out.println("\nCharacter\tType");
        System.out.println("-----------------------");

        for (int i = 0; i < data.length; i++)
        {
            System.out.println(data[i][0] + "\t\t" + data[i][1]);
        }
    }

    // Main method
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a string:");
        String text = input.nextLine();

        // Call methods
        String[][] result = findCharacterTypes(text);
        displayResult(result);
    }
}
