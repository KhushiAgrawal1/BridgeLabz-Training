package Linear_and_Binary_Search;

public class SearchWordInSentences {

    // Method to find first sentence containing the word
    public static String findSentence(String[] sentences, String word) {

        // Traverse sentences one by one
        for (String sentence : sentences) {

            // Check if sentence contains the word
            if (sentence.contains(word)) {
                return sentence;
            }
        }

        // Word not found in any sentence
        return "Not Found";
    }

    public static void main(String[] args) {

        String[] sentences = {
            "Java is a powerful programming language",
            "Linear search is simple",
            "Data structures are important",
            "Searching algorithms are useful"
        };

        String word = "search";

        String result = findSentence(sentences, word);

        System.out.println("Result: " + result);
    }
}

