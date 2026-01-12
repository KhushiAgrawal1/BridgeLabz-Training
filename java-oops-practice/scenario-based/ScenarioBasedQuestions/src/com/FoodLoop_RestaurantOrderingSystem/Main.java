package com.FoodLoop_RestaurantOrderingSystem;

public class Main {
    public static void main(String[] args) {
        // Create food items
        VegItem paneer = new VegItem("Paneer Butter Masala", 250, true);
        VegItem salad = new VegItem("Green Salad", 100, true);
        NonVegItem chicken = new NonVegItem("Chicken Curry", 300, true);
        NonVegItem fish = new NonVegItem("Grilled Fish", 400, false);

        // Create order
        Order myOrder = new Order();

        // Add items
        myOrder.addItem(paneer);
        myOrder.addItem(salad);
        myOrder.addItem(chicken);
        myOrder.addItem(fish); // Not available

        // Show order with discount
        myOrder.showOrder();

        // Place order
        myOrder.placeOrder();

        // Cancel order
        myOrder.cancelOrder();
    }
}

