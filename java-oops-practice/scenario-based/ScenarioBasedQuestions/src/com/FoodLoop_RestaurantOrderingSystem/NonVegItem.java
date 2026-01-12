package com.FoodLoop_RestaurantOrderingSystem;

public class NonVegItem extends FoodItem {
    public NonVegItem(String name, double price, boolean available) {
        super(name, "Non-Vegetarian", price, available);
    }
}

