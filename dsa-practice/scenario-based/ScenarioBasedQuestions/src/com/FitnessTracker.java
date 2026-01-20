package com;

class FitnessTracker {

    static void bubbleSort(int[] steps) {
        int n = steps.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (steps[j] < steps[j + 1]) {
                    // Swap for descending order
                    int temp = steps[j];
                    steps[j] = steps[j + 1];
                    steps[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] dailySteps = {8500, 12000, 9000, 15000, 11000};

        bubbleSort(dailySteps);

        System.out.println("Daily Step Count Leaderboard:");
        for (int step : dailySteps) {
            System.out.print(step + " ");
        }
    }
}

