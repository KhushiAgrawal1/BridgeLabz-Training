package com.regex;

import java.util.regex.*;
import java.util.*;

public class LanguageExtractor {
    public static void main(String[] args) {

        String text = "I love Java, Python, C and JavaScript, but I haven't tried yet.";

        // List of known programming languages
        String[] languages = {"Java", "Python", "JavaScript", "Go"};

        // Build dynamic regex
        String regex = "\\b(" + String.join("|", languages) + ")\\b";

        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        List<String> result = new ArrayList<>();

        while (matcher.find()) {
            // Use original matched form
            result.add(matcher.group());
        }

        System.out.println(String.join(", ", result));
    }
}

