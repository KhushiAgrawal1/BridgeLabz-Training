package com.collections.map_interface;

import java.util.*;

public class InvertMap {

    static <K, V> Map<V, List<K>> invert(Map<K, V> map) {
        Map<V, List<K>> inverted = new HashMap<>();

        for (Map.Entry<K, V> entry : map.entrySet()) {
            inverted
                .computeIfAbsent(entry.getValue(), k -> new ArrayList<>())
                .add(entry.getKey());
        }
        return inverted;
    }

    public static void main(String[] args) {
        Map<String, Integer> input = new HashMap<>();
        input.put("A", 1);
        input.put("B", 2);
        input.put("C", 1);

        System.out.println(invert(input));
    }
}

