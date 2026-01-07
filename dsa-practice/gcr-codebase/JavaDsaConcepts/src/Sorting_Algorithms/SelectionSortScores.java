package Sorting_Algorithms;

class SelectionSortScores {
    public static void main(String[] args) {
        int[] scores = {88, 92, 75, 81};

        for (int i = 0; i < scores.length - 1; i++) {
            int min = i;

            for (int j = i + 1; j < scores.length; j++) {
                if (scores[j] < scores[min])
                    min = j;
            }

            int temp = scores[min];
            scores[min] = scores[i];
            scores[i] = temp;
        }

        System.out.println("Sorted Exam Scores:");
        for (int s : scores)
            System.out.print(s + " ");
    }
}
