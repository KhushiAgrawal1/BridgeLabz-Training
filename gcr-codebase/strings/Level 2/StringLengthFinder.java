// Program Name : String Length Finder Without length()
// Description  : This program finds and returns the length of a string without
//                using the built-in length() method. It uses an infinite loop
//                and charAt() method until a runtime exception occurs.
//                The result is compared with the built-in length() method.

import java.util.Scanner;

public class StringLengthFinder
{
    // Method to find length of a string without using length()
    public static int findStringLength(String str)
    {
        int count = 0;

        try
        {
            // Infinite loop to access characters one by one
            while (true)
            {
                str.charAt(count); // Access character at index
                count++;           // Increment count
            }
        }
        catch (StringIndexOutOfBoundsException e)
        {
            // Exception occurs when index exceeds string length
            return count;
        }
    }

    // Main method
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Take user input using next()
        System.out.println("Enter a string:");
        String text = input.next();

        // Call user-defined method
        int customLength = findStringLength(text);

        // Call built-in length() method
        int builtInLength = text.length();

        // Display results
        System.out.println("Length using user-defined method: " + customLength);
        System.out.println("Length using built-in length(): " + builtInLength);
    }
}
