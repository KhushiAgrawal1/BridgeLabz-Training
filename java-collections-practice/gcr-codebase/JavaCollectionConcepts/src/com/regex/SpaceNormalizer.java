package com.regex;

public class SpaceNormalizer {
    public static void main(String[] args) {

        String text = "This   is    an   example   with   multiple   spaces.";

        // Regex for multiple spaces
        String regex = "\\s+";

        // Replace with single space
        String result = text.replaceAll(regex, " ");

        System.out.println(result);
    }
}

