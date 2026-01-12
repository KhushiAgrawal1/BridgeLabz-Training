package com.RuntimeAnalysisAndBigONotation;

import java.util.Random;

public class SortingComparison {

    // ---------- Bubble Sort ----------
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // ---------- Merge Sort ----------
    static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j])
                arr[k++] = L[i++];
            else
                arr[k++] = R[j++];
        }

        while (i < n1)
            arr[k++] = L[i++];

        while (j < n2)
            arr[k++] = R[j++];
    }

    // ---------- Quick Sort ----------
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int p = partition(arr, low, high);
            quickSort(arr, low, p - 1);
            quickSort(arr, p + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // ---------- Utility ----------
    static int[] generateArray(int size) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(100000);
        }
        return arr;
    }

    // ---------- Main ----------
    public static void main(String[] args) {

        int[] sizes = {1000, 10000};

        for (int size : sizes) {
            System.out.println("\nDataset Size: " + size);

            int[] arr1 = generateArray(size);
            int[] arr2 = arr1.clone();
            int[] arr3 = arr1.clone();

            long start, end;

            // Bubble Sort
            start = System.currentTimeMillis();
            bubbleSort(arr1);
            end = System.currentTimeMillis();
            System.out.println("Bubble Sort Time: " + (end - start) + " ms");

            // Merge Sort
            start = System.currentTimeMillis();
            mergeSort(arr2, 0, arr2.length - 1);
            end = System.currentTimeMillis();
            System.out.println("Merge Sort Time: " + (end - start) + " ms");

            // Quick Sort
            start = System.currentTimeMillis();
            quickSort(arr3, 0, arr3.length - 1);
            end = System.currentTimeMillis();
            System.out.println("Quick Sort Time: " + (end - start) + " ms");
        }
    }
}

