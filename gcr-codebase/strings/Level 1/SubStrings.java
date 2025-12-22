// Program Title : Substring Comparison
// Description   : This program creates a substring using a user-defined
//                 method with charAt() and compares it with the built-in
//                 substring() method.

import java.util.Scanner;

public class SubStrings {

    // Method to create substring using charAt()
    public static String findSubStrings(String string, int start, int end) {

        String result = "";

        // Build substring character by character
        for (int i = start; i < end; i++) {
            result += string.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking original string input
        System.out.println("Enter original String: ");
        String string = input.next();

        // Taking start index
        System.out.print("Enter start index for substring: ");
        int start = input.nextInt();

        // Taking end index
        System.out.print("Enter end index for substring: ");
        int end = input.nextInt();

        // Substring using user-defined method
        String result = findSubStrings(string, start, end);
        System.out.println("Using user defined method: " + result);

        // Substring using built-in method
        String subBuiltIn = string.substring(start, end);
        System.out.println("Substring using built in : " + subBuiltIn);

        // Comparing both results
        if (result.equals(subBuiltIn)) {
            System.out.println("same result");
        } else {
            System.out.println("different result");
        }

        input.close();
    }
}
