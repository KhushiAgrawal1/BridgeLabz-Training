package StringBuilder;

public class ReverseStringUsingStringBuilder {

    public static void main(String[] args) {
        String input = "hello";

        // Create StringBuilder object
        StringBuilder sb = new StringBuilder();

        // Append the string
        sb.append(input);

        // Reverse the string
        sb.reverse();

        // Convert back to String
        String reversedString = sb.toString();

        // Print result
        System.out.println("Reversed String: " + reversedString);
    }
}

