package com;

class FleetManager {

    // Merge Sort method
    static void mergeSort(int[] mileage, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(mileage, left, mid);
            mergeSort(mileage, mid + 1, right);

            merge(mileage, left, mid, right);
        }
    }

    // Merge two sorted parts
    static void merge(int[] mileage, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i < n1; i++)
            leftArray[i] = mileage[left + i];

        for (int j = 0; j < n2; j++)
            rightArray[j] = mileage[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                mileage[k++] = leftArray[i++];
            } else {
                mileage[k++] = rightArray[j++];
            }
        }

        while (i < n1)
            mileage[k++] = leftArray[i++];

        while (j < n2)
            mileage[k++] = rightArray[j++];
    }

    public static void main(String[] args) {
        // Combined vehicle mileage data from depots
        int[] vehicleMileage = {12000, 18000, 15000, 22000, 20000};

        mergeSort(vehicleMileage, 0, vehicleMileage.length - 1);

        System.out.println("Master Vehicle Maintenance Schedule (By Mileage):");
        for (int km : vehicleMileage) {
            System.out.print(km + " ");
        }
    }
}

