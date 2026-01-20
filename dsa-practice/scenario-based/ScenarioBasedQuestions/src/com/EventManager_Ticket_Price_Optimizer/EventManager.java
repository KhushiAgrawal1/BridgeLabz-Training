package com.EventManager_Ticket_Price_Optimizer;

public class EventManager {
	// Quick Sort method
    static void quickSort(int[] prices, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(prices, low, high);

            // Recursively sort left and right parts
            quickSort(prices, low, pivotIndex - 1);
            quickSort(prices, pivotIndex + 1, high);
        }
    }

    // Partition method
    static int partition(int[] prices, int low, int high) {
        int pivot = prices[high]; // Last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (prices[j] <= pivot) {
                i++;
                // Swap
                int temp = prices[i];
                prices[i] = prices[j];
                prices[j] = temp;
            }
        }

        // Place pivot at correct position
        int temp = prices[i + 1];
        prices[i + 1] = prices[high];
        prices[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        int[] ticketPrices = {1500, 500, 2500, 1200, 800, 3000, 600};

        quickSort(ticketPrices, 0, ticketPrices.length - 1);

        System.out.println("Sorted Ticket Prices:");
        for (int price : ticketPrices) {
            System.out.print(price + " ");
        }

        System.out.println("\n\nTop 3 Cheapest Tickets:");
        for (int i = 0; i < 3; i++) {
            System.out.print(ticketPrices[i] + " ");
        }

        System.out.println("\n\nTop 3 Most Expensive Tickets:");
        for (int i = ticketPrices.length - 3; i < ticketPrices.length; i++) {
            System.out.print(ticketPrices[i] + " ");
        }
    }

}
