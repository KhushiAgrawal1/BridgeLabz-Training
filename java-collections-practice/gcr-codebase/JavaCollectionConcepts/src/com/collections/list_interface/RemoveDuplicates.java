package com.collections.list_interface;

import java.util.*;

public class RemoveDuplicates {

    static List<Integer> removeDuplicates(List<Integer> list) {
        Set<Integer> set = new LinkedHashSet<>(list);
        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 1, 2, 2, 3, 4);

        List<Integer> result = removeDuplicates(numbers);
        System.out.println(result);
    }
}

