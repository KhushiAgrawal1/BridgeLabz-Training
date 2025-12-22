// Program Title : Lowercase Conversion and Comparison
// Description   : This program converts a string to lowercase using a
//                 user-defined method with charAt() and ASCII logic,
//                 compares it with the built-in toLowerCase() method,
//                 and checks if both results are equal.

import java.util.Scanner;

public class LowerCaseCompare {

    // Method to convert text to lowercase using charAt() and ASCII logic
    public static String toLowerCaseUsingCharAt(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            // Convert uppercase letters (A-Z) to lowercase
            if (c >= 'A' && c <= 'Z') {
                c = (char) (c + 32);
            }
            result += c;
        }
        return result;
    }

    // Method to compare two strings character by character
    public static boolean compareStrings(String customLower, String builtinLower) {
        if (customLower.length() != builtinLower.length()) {
            return false;
        }
        for (int i = 0; i < customLower.length(); i++) {
            if (customLower.charAt(i) != builtinLower.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take string input from user
        System.out.print("Enter string: ");
        String text = input.nextLine();

        // Convert using user-defined method
        String customLower = toLowerCaseUsingCharAt(text);
        System.out.println("Using user-defined: " + customLower);

        // Convert using built-in method
        String builtinLower = text.toLowerCase();
        System.out.println("Using built-in: " + builtinLower);

        // Compare both results
        boolean result = compareStrings(customLower, builtinLower);
        System.out.println("Are both results equal? " + result);

        input.close();
    }
}
