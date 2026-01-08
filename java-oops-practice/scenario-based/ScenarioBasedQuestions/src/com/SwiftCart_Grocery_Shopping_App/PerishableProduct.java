package com.SwiftCart_Grocery_Shopping_App;

public class PerishableProduct extends Product {

    public PerishableProduct(String name, double price) {
        super(name, price, "Perishable");
    }

    public double applyDiscount(double total) {
        return total * 0.90; // 10% discount
    }
}

