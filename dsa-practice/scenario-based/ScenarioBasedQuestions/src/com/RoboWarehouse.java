package com;

class RoboWarehouse {

    // Insertion Sort method
    static void insertionSort(int[] weights) {
        for (int i = 1; i < weights.length; i++) {
            int current = weights[i];
            int j = i - 1;

            // Shift heavier packages to the right
            while (j >= 0 && weights[j] > current) {
                weights[j + 1] = weights[j];
                j--;
            }

            // Insert current package at correct position
            weights[j + 1] = current;
        }
    }

    public static void main(String[] args) {
        int[] packageWeights = {20, 5, 15, 10, 30};

        insertionSort(packageWeights);

        System.out.println("Shelf Order (Ascending by Weight):");
        for (int weight : packageWeights) {
            System.out.print(weight + " ");
        }
    }
}

