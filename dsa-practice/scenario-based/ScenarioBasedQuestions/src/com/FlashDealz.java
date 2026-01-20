package com;

class FlashDealz {

    static void quickSort(int[] discounts, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(discounts, low, high);
            quickSort(discounts, low, pivotIndex - 1);
            quickSort(discounts, pivotIndex + 1, high);
        }
    }

    static int partition(int[] discounts, int low, int high) {
        int pivot = discounts[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (discounts[j] > pivot) { // descending order
                i++;
                int temp = discounts[i];
                discounts[i] = discounts[j];
                discounts[j] = temp;
            }
        }

        int temp = discounts[i + 1];
        discounts[i + 1] = discounts[high];
        discounts[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        int[] productDiscounts = {30, 50, 10, 70, 40, 60};

        quickSort(productDiscounts, 0, productDiscounts.length - 1);

        System.out.println("Products Sorted by Discount:");
        for (int discount : productDiscounts) {
            System.out.print(discount + "% ");
        }
    }
}

