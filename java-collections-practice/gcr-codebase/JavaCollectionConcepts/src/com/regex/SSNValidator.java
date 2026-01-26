package com.regex;

import java.util.regex.*;

public class SSNValidator {
    public static void main(String[] args) {

        String[] inputs = {
            "My SSN is 123-45-6789.",
            "123-45-6789",
            "123456789"
        };

        // Regex for SSN format: XXX-XX-XXXX
        String regex = "\\b\\d{3}-\\d{2}-\\d{4}\\b";

        Pattern pattern = Pattern.compile(regex);

        for (String text : inputs) {
            Matcher matcher = pattern.matcher(text);

            if (matcher.find()) {
                System.out.println("✅ \"" + matcher.group() + "\" is valid");
            } else {
                System.out.println("❌ \"" + text + "\" is invalid");
            }
        }
    }
}

