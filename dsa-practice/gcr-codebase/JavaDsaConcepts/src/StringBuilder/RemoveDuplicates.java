package StringBuilder;

import java.util.HashSet;

public class RemoveDuplicates {

    public static String removeDuplicates(String input) {
        // StringBuilder to store result
        StringBuilder result = new StringBuilder();

        // HashSet to track already seen characters
        HashSet<Character> seen = new HashSet<>();

        // Iterate through each character of the string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // If character is not already present
            if (!seen.contains(ch)) {
                result.append(ch);
                seen.add(ch);
            }
        }

        // Convert StringBuilder to String
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "programming";
        String output = removeDuplicates(input);

        System.out.println("Original String: " + input);
        System.out.println("After Removing Duplicates: " + output);
    }
}

