public class  ReverseWordsInString {
    public String reverseWords(String s) {
        // Trim leading & trailing spaces
        s = s.trim();

        // Split the string by one or more spaces using regex
        String[] words = s.split("\\s+");

        // Use StringBuilder to build the reversed string
        StringBuilder reversed = new StringBuilder();

        // Append words in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" "); // Add space between words
            }
        }

        return reversed.toString();
		}
}
