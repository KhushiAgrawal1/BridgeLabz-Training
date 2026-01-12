package com.FoodLoop_RestaurantOrderingSystem;

public class FoodItem {
    private String name;
    private String category;
    private double price;
    private boolean available;

    // Constructor
    public FoodItem(String name, String category, double price, boolean available) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.available = available;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return available;
    }

    // Setters (Encapsulation for availability)
    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void displayItem() {
        System.out.println(name + " (" + category + ") - ₹" + price + " | Available: " + available);
    }
}
