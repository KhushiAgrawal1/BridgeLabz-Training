// Program Title : Compare Two Strings
// Description   : This program compares two strings using a user-defined
//                 method with charAt() and verifies the result using the
//                 built-in equals() method.

import java.util.Scanner;

public class CompareTwoStrings {

    // Method to compare two strings character by character
    public static boolean compareStrings(String string1, String string2) {

        // Check if lengths are different
        if (string1.length() != string2.length()) {
            return false;
        }

        // Compare each character
        for (int i = 0; i < string1.length(); i++) {
            if (string1.charAt(i) != string2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking first string input
        System.out.println("Enter String 1: ");
        String string1 = input.next();

        // Taking second string input
        System.out.println("Enter String 2: ");
        String string2 = input.next();

        // Compare using user-defined method
        boolean result = compareStrings(string1, string2);
        System.out.println("Using charAt: " + result);

        // Compare using built-in equals() method
        boolean builtInResult = string1.equals(string2);
        System.out.println("Using equals: " + builtInResult);

        // Check if both results are same
        if (result == builtInResult) {
            System.out.println("same result");
        } else {
            System.out.println("different result");
        }

        input.close();
    }
}
