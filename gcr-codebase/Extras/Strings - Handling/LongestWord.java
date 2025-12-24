/* Program Name: Find Longest Word
   Description : This program finds the longest word in a sentence
                 using split and length methods.
*/
import java.util.Scanner;

public class LongestWord {
    public static String findLongestWord(String sentence) {
        String[] words = sentence.split(" ");
        String longest = words[0];

        for (String word : words)
            if (word.length() > longest.length())
                longest = word;

        return longest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        System.out.println(findLongestWord(sentence));
    }
}
