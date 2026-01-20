package com;

class MovieTime {

    // Insertion Sort for show times
    static void insertionSort(int[] showTimes) {
        for (int i = 1; i < showTimes.length; i++) {
            int currentTime = showTimes[i];
            int j = i - 1;

            // Shift later showtimes forward
            while (j >= 0 && showTimes[j] > currentTime) {
                showTimes[j + 1] = showTimes[j];
                j--;
            }

            // Insert at correct position
            showTimes[j + 1] = currentTime;
        }
    }

    public static void main(String[] args) {
        // Show times in 24-hour format (HHMM)
        int[] showTimes = {1200, 1400, 1100, 1600, 1300};

        insertionSort(showTimes);

        System.out.println("Sorted Theater Show Listings:");
        for (int time : showTimes) {
            System.out.print(time + " ");
        }
    }
}

