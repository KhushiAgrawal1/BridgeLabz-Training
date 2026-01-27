package com.regex;

public class BadWordCensor {
	public static void main(String[] args) {

        String sentence = "This is a damn bad example with some stupid words.";

        // List of bad words
        String[] badWords = {"damn", "stupid"};

        for (String word : badWords) {
            // Replace each bad word with ****
            sentence = sentence.replaceAll("(?i)\\b" + word + "\\b", "****");
        }

        System.out.println(sentence);
    }

}
