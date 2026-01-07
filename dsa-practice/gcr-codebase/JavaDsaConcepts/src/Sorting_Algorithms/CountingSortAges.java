package Sorting_Algorithms;

class CountingSortAges {
    public static void main(String[] args) {
        int[] ages = {12, 15, 10, 14, 12};
        int maxAge = 18;

        int[] count = new int[maxAge + 1];

        for (int age : ages)
            count[age]++;

        System.out.println("Sorted Ages:");
        for (int i = 0; i <= maxAge; i++) {
            while (count[i] > 0) {
                System.out.print(i + " ");
                count[i]--;
            }
        }
    }
}
