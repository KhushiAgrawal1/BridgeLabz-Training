package Sorting_Algorithms;

class InsertionSortEmployee {
    public static void main(String[] args) {
        int[] ids = {105, 101, 109, 102};

        for (int i = 1; i < ids.length; i++) {
            int key = ids[i];
            int j = i - 1;

            while (j >= 0 && ids[j] > key) {
                ids[j + 1] = ids[j];
                j--;
            }
            ids[j + 1] = key;
        }

        System.out.println("Sorted Employee IDs:");
        for (int id : ids)
            System.out.print(id + " ");
    }
}

