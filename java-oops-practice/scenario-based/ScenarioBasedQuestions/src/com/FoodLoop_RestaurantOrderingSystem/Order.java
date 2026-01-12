package com.FoodLoop_RestaurantOrderingSystem;

import java.util.ArrayList;

public class Order implements IOrderable {
    private ArrayList<FoodItem> items;
    private double totalPrice;

    // Constructor
    public Order() {
        items = new ArrayList<>();
        totalPrice = 0.0;
    }

    // Add item to order
    public void addItem(FoodItem item) {
        if(item.isAvailable()) {
            items.add(item);
            totalPrice += item.getPrice();
            System.out.println(item.getName() + " added to order.");
        } else {
            System.out.println(item.getName() + " is not available.");
        }
    }

    // Display all items
    public void showOrder() {
        System.out.println("\nYour Order:");
        for(FoodItem item : items) {
            item.displayItem();
        }
        System.out.println("Total Price before discount: ₹" + totalPrice);
        System.out.println("Total Price after discount: ₹" + applyDiscount());
    }

    // Polymorphism: Apply discount based on total price
    public double applyDiscount() {
        double discount = 0;
        if(totalPrice >= 500) {
            discount = totalPrice * 0.10; // 10% discount for orders >= 500
        } else if(totalPrice >= 300) {
            discount = totalPrice * 0.05; // 5% discount for orders >= 300
        }
        return totalPrice - discount;
    }

    // Interface methods
    @Override
    public void placeOrder() {
        System.out.println("Order placed successfully!");
    }

    @Override
    public void cancelOrder() {
        items.clear();
        totalPrice = 0;
        System.out.println("Order cancelled successfully.");
    }
}

