package com.RuntimeAnalysisAndBigONotation;

import java.util.HashSet;
import java.util.TreeSet;

public class SearchPerformanceComparison {

    // ---------- Array Search (Linear Search) ----------
    static boolean searchArray(int[] arr, int key) {
        for (int value : arr) {
            if (value == key)
                return true;
        }
        return false;
    }

    // ---------- Main ----------
    public static void main(String[] args) {

        int[] sizes = {1000, 100000, 1000000};
        int key = -1; // element not present (worst case)

        for (int n : sizes) {
            System.out.println("\nDataset Size: " + n);

            // Create data structures
            int[] array = new int[n];
            HashSet<Integer> hashSet = new HashSet<>();
            TreeSet<Integer> treeSet = new TreeSet<>();

            for (int i = 0; i < n; i++) {
                array[i] = i;
                hashSet.add(i);
                treeSet.add(i);
            }

            long start, end;

            // Array Search
            start = System.currentTimeMillis();
            searchArray(array, key);
            end = System.currentTimeMillis();
            System.out.println("Array Search Time: " + (end - start) + " ms");

            // HashSet Search
            start = System.currentTimeMillis();
            hashSet.contains(key);
            end = System.currentTimeMillis();
            System.out.println("HashSet Search Time: " + (end - start) + " ms");

            // TreeSet Search
            start = System.currentTimeMillis();
            treeSet.contains(key);
            end = System.currentTimeMillis();
            System.out.println("TreeSet Search Time: " + (end - start) + " ms");
        }
    }
}
