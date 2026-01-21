package com.collections.list_interface;

import java.util.*;

public class RotateList {

    static List<Integer> rotateList(List<Integer> list, int k) {
        int n = list.size();
        k = k % n;

        List<Integer> result = new ArrayList<>();

        result.addAll(list.subList(k, n));
        result.addAll(list.subList(0, k));

        return result;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        List<Integer> rotated = rotateList(numbers, 2);
        System.out.println(rotated);
    }
}

