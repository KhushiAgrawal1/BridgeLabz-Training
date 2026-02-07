package com.multithreading.Restaurant_Order_Processing_System;

public class RestaurantManager {
    public static void main(String[] args) {

        // Create chef threads
        Chef chef1 = new Chef("Chef-1", "Pizza", 3000);
        Chef chef2 = new Chef("Chef-2", "Pasta", 2000);
        Chef chef3 = new Chef("Chef-3", "Salad", 1000);
        Chef chef4 = new Chef("Chef-4", "Burger", 2500);

        // Start all chefs
        chef1.start();
        chef2.start();
        chef3.start();
        chef4.start();

        // Manager waits for all chefs to finish
        try {
            chef1.join();
            chef2.join();
            chef3.join();
            chef4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Kitchen closed - All orders completed");
    }
}

