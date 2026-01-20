package com;

class CinemaHouse {

    // Bubble Sort method
    static void bubbleSort(int[] showTimes) {
        int n = showTimes.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (showTimes[j] > showTimes[j + 1]) {
                    // Swap
                    int temp = showTimes[j];
                    showTimes[j] = showTimes[j + 1];
                    showTimes[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] movieShowTimes = {1800, 1400, 2100, 1200, 1600};

        bubbleSort(movieShowTimes);

        System.out.println("Sorted Movie Show Times:");
        for (int time : movieShowTimes) {
            System.out.print(time + " ");
        }
    }
}

