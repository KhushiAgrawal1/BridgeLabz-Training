package com;

class EduResults {

    static void mergeSort(int[] marks, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(marks, left, mid);
            mergeSort(marks, mid + 1, right);

            merge(marks, left, mid, right);
        }
    }

    static void merge(int[] marks, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        for (int i = 0; i < n1; i++)
            leftArr[i] = marks[left + i];

        for (int j = 0; j < n2; j++)
            rightArr[j] = marks[mid + 1 + j];

        int i = 0, j = 0, k = left;

        // Descending order (highest marks first)
        while (i < n1 && j < n2) {
            if (leftArr[i] >= rightArr[j]) {
                marks[k++] = leftArr[i++];
            } else {
                marks[k++] = rightArr[j++];
            }
        }

        while (i < n1)
            marks[k++] = leftArr[i++];

        while (j < n2)
            marks[k++] = rightArr[j++];
    }

    public static void main(String[] args) {
        int[] studentMarks = {85, 92, 78, 92, 88, 75};

        mergeSort(studentMarks, 0, studentMarks.length - 1);

        System.out.println("State-wise Rank List:");
        for (int mark : studentMarks) {
            System.out.print(mark + " ");
        }
    }
}

