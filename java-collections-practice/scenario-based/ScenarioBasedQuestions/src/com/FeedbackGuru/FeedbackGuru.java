package com.FeedbackGuru;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class FeedbackGuru {

    public static void main(String[] args) {

        // Map to store categories
        Map<String, List<String>> feedbackMap = new HashMap<>();
        feedbackMap.put("Positive", new ArrayList<>());
        feedbackMap.put("Neutral", new ArrayList<>());
        feedbackMap.put("Negative", new ArrayList<>());

        // Regex pattern to extract rating like 7/10
        Pattern pattern = Pattern.compile("(\\d+)/10");

        try {
            BufferedReader reader = new BufferedReader(new FileReader("feedback.txt"));
            String line;

            while ((line = reader.readLine()) != null) {
                try {
                    Matcher matcher = pattern.matcher(line);

                    if (matcher.find()) {
                        int rating = Integer.parseInt(matcher.group(1));

                        Feedback<String> fb = new Feedback<>("Service", line, rating);

                        // Categorize feedback
                        if (rating >= 8) {
                            feedbackMap.get("Positive").add(fb.getMessage());
                        } else if (rating >= 5) {
                            feedbackMap.get("Neutral").add(fb.getMessage());
                        } else {
                            feedbackMap.get("Negative").add(fb.getMessage());
                        }
                    } else {
                        throw new Exception("Invalid feedback line");
                    }

                } catch (Exception e) {
                    System.out.println("Skipping invalid line: " + line);
                }
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Error reading file.");
        }

        // Print results
        System.out.println("\n--- Feedback Summary ---");

        for (String category : feedbackMap.keySet()) {
            System.out.println("\n" + category + " Feedback:");
            for (String msg : feedbackMap.get(category)) {
                System.out.println(msg);
            }
        }
    }
}

