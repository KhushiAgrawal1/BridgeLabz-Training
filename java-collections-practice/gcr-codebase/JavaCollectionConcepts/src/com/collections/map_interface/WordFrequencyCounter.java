package com.collections.map_interface;

import java.util.*;

public class WordFrequencyCounter {

    static Map<String, Integer> countWords(String text) {
        Map<String, Integer> map = new HashMap<>();

        // Normalize text
        text = text.toLowerCase().replaceAll("[^a-z ]", "");
        String[] words = text.split("\\s+");

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        return map;
    }

    public static void main(String[] args) {
        String input = "Hello world, hello Java!";
        System.out.println(countWords(input));
    }
}

