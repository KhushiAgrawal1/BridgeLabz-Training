package com;

class FoodFest {

    static void mergeSort(int[] footfall, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(footfall, left, mid);
            mergeSort(footfall, mid + 1, right);

            merge(footfall, left, mid, right);
        }
    }

    static void merge(int[] footfall, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        for (int i = 0; i < n1; i++)
            leftArr[i] = footfall[left + i];

        for (int j = 0; j < n2; j++)
            rightArr[j] = footfall[mid + 1 + j];

        int i = 0, j = 0, k = left;

        // Descending order (highest footfall first)
        while (i < n1 && j < n2) {
            if (leftArr[i] >= rightArr[j]) {
                footfall[k++] = leftArr[i++];
            } else {
                footfall[k++] = rightArr[j++];
            }
        }

        while (i < n1)
            footfall[k++] = leftArr[i++];

        while (j < n2)
            footfall[k++] = rightArr[j++];
    }

    public static void main(String[] args) {
        int[] stallFootfall = {120, 200, 150, 300, 250};

        mergeSort(stallFootfall, 0, stallFootfall.length - 1);

        System.out.println("Stalls Sorted by Customer Footfall:");
        for (int count : stallFootfall) {
            System.out.print(count + " ");
        }
    }
}

