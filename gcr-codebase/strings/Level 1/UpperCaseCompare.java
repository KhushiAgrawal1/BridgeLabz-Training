import java.util.Scanner;

public class UpperCaseCompare {

    // Method to convert text to uppercase using charAt() and ASCII logic
    public static String toUpperCaseUsingCharAt(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Check if character is lowercase (a–z)
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32); // Convert to uppercase
            }
            result += ch;
        }
        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take complete text input
        System.out.print("Enter the complete text: ");
        String text = input.nextLine();

        // Convert using user-defined method
        String customUpper = toUpperCaseUsingCharAt(text);
        System.out.println("Uppercase using charAt(): " + customUpper);

        // Convert using built-in method
        String builtInUpper = text.toUpperCase();
        System.out.println("Uppercase using toUpperCase(): " + builtInUpper);

        // Compare both results
        boolean result = compareStrings(customUpper, builtInUpper);
        System.out.println("Are both results equal? " + result);

        input.close();
    }
}
