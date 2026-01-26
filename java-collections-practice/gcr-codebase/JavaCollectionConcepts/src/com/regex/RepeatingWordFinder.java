package com.regex;

import java.util.regex.*;
import java.util.*;

public class RepeatingWordFinder {
    public static void main(String[] args) {

        String text = "This is is a repeated repeated word test.";

        // Regex for repeating words
        String regex = "\\b(\\w+)\\b\\s+\\1\\b";

        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        Set<String> repeats = new LinkedHashSet<>();

        while (matcher.find()) {
            repeats.add(matcher.group(1));  // group(1) = repeated word
        }

        System.out.println(String.join(", ", repeats));
    }
}

