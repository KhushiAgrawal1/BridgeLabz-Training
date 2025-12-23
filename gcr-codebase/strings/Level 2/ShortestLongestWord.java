// Program Name : Shortest and Longest Word Finder
// Description  : This program splits a given text into words without using
//                the built-in split() method. It finds the length of each word
//                without using length(), stores words and their lengths in
//                a 2D array, and determines the shortest and longest words.

import java.util.Scanner;

public class ShortestLongestWord
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

        // Count words by counting spaces
        for (int i = 0; i < length; i++)
        {
            if (text.charAt(i) == ' ')
            {
                wordCount++;
            }
        }

        // Store space indexes
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

        // Extract words
        String[] words = new String[wordCount];
        for (int i = 0; i < wordCount; i++)
        {
            words[i] = text.substring(spaceIndex[i] + 1, spaceIndex[i + 1]);
        }

        return words;
    }

    // Method to create a 2D array of words and their lengths
    public static String[][] getWordLengthArray(String[] words)
    {
        String[][] wordLength = new String[words.length][2];

        for (int i = 0; i < words.length; i++)
        {
            int length = findStringLength(words[i]);
            wordLength[i][0] = words[i];
            wordLength[i][1] = String.valueOf(length);
        }
        return wordLength;
    }

    // Method to find shortest and longest word indexes
    // Returns array: [0] = shortest index, [1] = longest index
    public static int[] findShortestAndLongest(String[][] wordLength)
    {
        int shortestIndex = 0;
        int longestIndex = 0;

        for (int i = 1; i < wordLength.length; i++)
        {
            int currentLength = Integer.parseInt(wordLength[i][1]);
            int shortestLength = Integer.parseInt(wordLength[shortestIndex][1]);
            int longestLength = Integer.parseInt(wordLength[longestIndex][1]);

            if (currentLength < shortestLength)
            {
                shortestIndex = i;
            }
            if (currentLength > longestLength)
            {
                longestIndex = i;
            }
        }
        return new int[] { shortestIndex, longestIndex };
    }

    // Main method
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Take input using nextLine()
        System.out.println("Enter a sentence:");
        String text = input.nextLine();

        // Split text into words
        String[] words = splitTextManually(text);

        // Create 2D array of word and length
        String[][] wordLengthArray = getWordLengthArray(words);

        // Display words with lengths
        System.out.println("\nWord\tLength");
        for (int i = 0; i < wordLengthArray.length; i++)
        {
            System.out.println(wordLengthArray[i][0] + "\t" + wordLengthArray[i][1]);
        }

        // Find shortest and longest words
        int[] result = findShortestAndLongest(wordLengthArray);

        System.out.println("\nShortest word: " + wordLengthArray[result[0]][0]);
        System.out.println("Longest word: " + wordLengthArray[result[1]][0]);
    }
}
