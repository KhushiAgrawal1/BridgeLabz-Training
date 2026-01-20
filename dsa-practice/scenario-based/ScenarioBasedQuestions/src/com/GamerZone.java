package com;

class GamerZone {

    static void quickSort(int[] scores, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(scores, low, high);
            quickSort(scores, low, pivotIndex - 1);
            quickSort(scores, pivotIndex + 1, high);
        }
    }

    static int partition(int[] scores, int low, int high) {
        int pivot = scores[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (scores[j] > pivot) { // descending order
                i++;
                int temp = scores[i];
                scores[i] = scores[j];
                scores[j] = temp;
            }
        }

        int temp = scores[i + 1];
        scores[i + 1] = scores[high];
        scores[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        int[] playerScores = {4500, 7200, 6100, 8900, 5000};

        quickSort(playerScores, 0, playerScores.length - 1);

        System.out.println("GamerZone Leaderboard:");
        for (int score : playerScores) {
            System.out.print(score + " ");
        }
    }
}
