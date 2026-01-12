package StringBuffer;

public class StringBufferConcatenation {

    public static String concatenateStrings(String[] arr) {
        // Create StringBuffer object
        StringBuffer buffer = new StringBuffer();

        // Append each string to StringBuffer
        for (String str : arr) {
            buffer.append(str);
        }

        // Convert StringBuffer to String
        return buffer.toString();
    }

    public static void main(String[] args) {
        String[] words = {"Java", " ", "is", " ", "powerful"};

        String result = concatenateStrings(words);

        System.out.println("Concatenated String: " + result);
    }
}

