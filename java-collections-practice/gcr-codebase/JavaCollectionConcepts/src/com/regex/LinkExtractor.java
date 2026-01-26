package com.regex;

import java.util.regex.*;
import java.util.*;

public class LinkExtractor {
    public static void main(String[] args) {

        String text = "Visit https://www.google.com and http://example.org for more info.";

        // Regex for URLs
        String regex = "\\bhttps?://[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}(/\\S*)?\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        List<String> links = new ArrayList<>();

        while (matcher.find()) {
            links.add(matcher.group());
        }

        System.out.println(String.join(", ", links));
    }
}

