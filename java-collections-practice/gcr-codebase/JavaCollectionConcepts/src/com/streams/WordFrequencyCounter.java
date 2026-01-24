package com.streams;

import java.io.*;
import java.util.*;

public class WordFrequencyCounter {

    public static void main(String[] args) {

        String filePath = "input.txt";   // Input file

        HashMap<String, Integer> wordCountMap = new HashMap<>();

        // -------- Reading File --------
        try (
            FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr)
        ) {

            String line;

            while ((line = br.readLine()) != null) {

                // Convert to lowercase for case-insensitive comparison
                line = line.toLowerCase();

                // Remove punctuation and special characters
                line = line.replaceAll("[^a-z0-9 ]", " ");

                // Split line into words
                String[] words = line.split("\\s+");

                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                    }
                }
            }

        } catch (IOException e) {
            System.out.println("File Read Error: " + e.getMessage());
            return;
        }

        // -------- Sorting by Frequency --------
        List<Map.Entry<String, Integer>> wordList = new ArrayList<>(wordCountMap.entrySet());

        // Sort in descending order of frequency
        wordList.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        // -------- Display Results --------
        System.out.println("Total Unique Words: " + wordCountMap.size());
        System.out.println("\n===== Top 5 Most Frequent Words =====");

        int limit = Math.min(5, wordList.size());
        for (int i = 0; i < limit; i++) {
            Map.Entry<String, Integer> entry = wordList.get(i);
            System.out.println((i + 1) + ". " + entry.getKey() + " → " + entry.getValue() + " times");
        }
    }
}

