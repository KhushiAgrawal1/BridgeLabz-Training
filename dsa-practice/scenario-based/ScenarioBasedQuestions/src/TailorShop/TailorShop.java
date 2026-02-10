package TailorShop;

import java.util.Scanner;

class TailorShop {

    // Insertion Sort based on deadline
    public static void insertionSort(Order[] orders) {
        for (int i = 1; i < orders.length; i++) {
            Order key = orders[i];
            int j = i - 1;

            while (j >= 0 && orders[j].deadline > key.deadline) {
                orders[j + 1] = orders[j];
                j--;
            }
            orders[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of orders: ");
        int n = sc.nextInt();

        Order[] orders = new Order[n];

        System.out.println("Enter deadlines:");
        for (int i = 0; i < n; i++) {
            int d = sc.nextInt();
            orders[i] = new Order(d);
        }

        insertionSort(orders);

        System.out.println("Sorted deadlines:");
        for (Order o : orders) {
            System.out.print(o.deadline + " ");
        }
    }
}

