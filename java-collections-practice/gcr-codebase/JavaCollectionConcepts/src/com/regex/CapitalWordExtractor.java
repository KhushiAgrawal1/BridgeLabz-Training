package com.regex;

import java.util.regex.*;
import java.util.*;

public class CapitalWordExtractor {
    public static void main(String[] args) {

        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";

        // Regex: word starting with Capital letter
        String regex = "\\b[A-Z][a-z]*\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        // Store words
        List<String> words = new ArrayList<>();

        while (matcher.find()) {
            words.add(matcher.group());
        }

        // Print result
        System.out.println(String.join(", ", words));
    }
}

