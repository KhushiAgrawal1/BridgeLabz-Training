package com.SmartCheckout_Supermarket_Billing_Queue;

import java.util.HashMap;

class SmartCheckout {

    // Customer Queue (User Defined)
    static class CustomerQueue {
        String[] queue;
        int front = 0, rear = -1, size;

        CustomerQueue(int capacity) {
            queue = new String[capacity];
            size = capacity;
        }

        void addCustomer(String name) {
            if (rear == size - 1) {
                System.out.println("Checkout Queue Full!");
                return;
            }
            queue[++rear] = name;
            System.out.println("Customer added: " + name);
        }

        String removeCustomer() {
            if (front > rear) {
                System.out.println("No customers in queue!");
                return null;
            }
            return queue[front++];
        }
    }

    // Item price & stock
    HashMap<String, Integer> priceMap = new HashMap<>();
    HashMap<String, Integer> stockMap = new HashMap<>();

    void addItem(String item, int price, int stock) {
        priceMap.put(item, price);
        stockMap.put(item, stock);
    }

    void purchaseItem(String item) {
        if (!priceMap.containsKey(item) || stockMap.get(item) <= 0) {
            System.out.println(item + " out of stock!");
            return;
        }

        stockMap.put(item, stockMap.get(item) - 1);
        System.out.println("Purchased " + item + " for ₹" + priceMap.get(item));
    }

    public static void main(String[] args) {
        SmartCheckout sc = new SmartCheckout();
        CustomerQueue q = new CustomerQueue(3);

        sc.addItem("Milk", 50, 5);
        sc.addItem("Bread", 40, 3);

        q.addCustomer("Amit");
        q.addCustomer("Riya");

        System.out.println("\nServing: " + q.removeCustomer());
        sc.purchaseItem("Milk");
        sc.purchaseItem("Bread");
    }
}
