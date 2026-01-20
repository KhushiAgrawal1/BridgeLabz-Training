package com.ExamCell_Student_Rank_Generator;

public class ExamCell {
	 // Merge Sort method
    static void mergeSort(int[] scores, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            // Sort left and right halves
            mergeSort(scores, left, mid);
            mergeSort(scores, mid + 1, right);

            // Merge sorted halves
            merge(scores, left, mid, right);
        }
    }

    // Merge two sorted arrays
    static void merge(int[] scores, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i < n1; i++)
            leftArray[i] = scores[left + i];

        for (int j = 0; j < n2; j++)
            rightArray[j] = scores[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (leftArray[i] >= rightArray[j]) {
                scores[k++] = leftArray[i++];
            } else {
                scores[k++] = rightArray[j++];
            }
        }

        while (i < n1)
            scores[k++] = leftArray[i++];

        while (j < n2)
            scores[k++] = rightArray[j++];
    }

    public static void main(String[] args) {
        int[] studentScores = {78, 92, 85, 67, 88, 95, 73};

        mergeSort(studentScores, 0, studentScores.length - 1);

        System.out.println("State Level Rank List (Highest to Lowest):");
        for (int score : studentScores) {
            System.out.print(score + " ");
        }
    }
}
