
class IceCreamRush {

    // Bubble Sort to sort sales in ascending order
    static void bubbleSort(int[] sales) {
        int n = sales.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (sales[j] > sales[j + 1]) {
                    // Swap adjacent elements
                    int temp = sales[j];
                    sales[j] = sales[j + 1];
                    sales[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        // Weekly sales count of ice cream flavors
        int[] flavorSales = {45, 30, 60, 25, 80, 50, 40, 35};

        bubbleSort(flavorSales);

        System.out.println("Ice Cream Flavors Sorted by Popularity:");
        for (int sale : flavorSales) {
            System.out.print(sale + " ");
        }
    }
}

