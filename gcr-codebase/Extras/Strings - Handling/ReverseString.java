/* Program Name: Reverse a String
   Description : This program reverses a given string using
                 built-in StringBuilder reverse method.
*/
public class ReverseString {
    public static void main(String[] args) {
        String original = "Hello World";
        String reversed = "";

        // Loop through the string from end to start
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        System.out.println("Reversed String: " + reversed);
    }
}

