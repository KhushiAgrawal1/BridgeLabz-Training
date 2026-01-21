package com.collections.map_interface;

import java.util.*;

public class MergeMaps {

    static Map<String, Integer> merge(
            Map<String, Integer> map1,
            Map<String, Integer> map2) {

        Map<String, Integer> result = new HashMap<>(map1);

        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            result.put(
                entry.getKey(),
                result.getOrDefault(entry.getKey(), 0) + entry.getValue()
            );
        }
        return result;
    }

    public static void main(String[] args) {
        Map<String, Integer> map1 = Map.of("A", 1, "B", 2);
        Map<String, Integer> map2 = Map.of("B", 3, "C", 4);

        System.out.println(merge(map1, map2));
    }
}

