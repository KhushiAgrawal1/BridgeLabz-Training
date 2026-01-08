package com.SwiftCart_Grocery_Shopping_App;

public class NonPerishableProduct extends Product {

    public NonPerishableProduct(String name, double price) {
        super(name, price, "Non-Perishable");
    }

    public double applyDiscount(double total) {
        return total * 0.95; // 5% discount
    }
}

