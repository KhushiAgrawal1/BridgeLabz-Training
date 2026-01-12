package com.RuntimeAnalysisAndBigONotation;

import java.util.Arrays;
import java.util.Random;

public class SearchComparison {

    // Linear Search
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // Binary Search
    public static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    // Create dataset
    public static int[] generateData(int size) {
        int[] data = new int[size];
        for (int i = 0; i < size; i++) {
            data[i] = i + 1; // sorted data
        }
        return data;
    }

    public static void main(String[] args) {

        int[] sizes = {1000, 10000, 1000000};
        int target;

        for (int size : sizes) {

            int[] data = generateData(size);
            target = size; // target at the end (worst case)

            // Linear Search timing
            long startLinear = System.nanoTime();
            linearSearch(data, target);
            long endLinear = System.nanoTime();

            // Binary Search timing
            long startBinary = System.nanoTime();
            binarySearch(data, target);
            long endBinary = System.nanoTime();

            long linearTime = endLinear - startLinear;
            long binaryTime = endBinary - startBinary;

            System.out.println("Dataset Size: " + size);
            System.out.println("Linear Search Time: " + linearTime + " ns");
            System.out.println("Binary Search Time: " + binaryTime + " ns");
            System.out.println("----------------------------------");
        }
    }
}
