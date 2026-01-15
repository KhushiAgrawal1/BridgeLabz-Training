package com.ZipZipMart_Daily_Sales_Summary_Report;

class ZipZipMart {

    static class Sale {
        int amount;
        String date;

        Sale(String date, int amount) {
            this.date = date;
            this.amount = amount;
        }
    }

    static void mergeSort(Sale[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    static void merge(Sale[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        Sale[] L = new Sale[n1];
        Sale[] R = new Sale[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i].amount <= R[j].amount) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }

    static void display(Sale[] sales) {
        for (Sale s : sales) {
            System.out.println(s.date + " | Amount: ₹" + s.amount);
        }
    }

    public static void main(String[] args) {
        Sale[] sales = {
            new Sale("2025-01-10", 500),
            new Sale("2025-01-09", 1200),
            new Sale("2025-01-11", 800),
            new Sale("2025-01-08", 400)
        };

        mergeSort(sales, 0, sales.length - 1);
        display(sales);
    }
}

