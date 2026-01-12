package com.FoodLoop_RestaurantOrderingSystem;

public class VegItem extends FoodItem {
    public VegItem(String name, double price, boolean available) {
        super(name, "Vegetarian", price, available);
    }
}

