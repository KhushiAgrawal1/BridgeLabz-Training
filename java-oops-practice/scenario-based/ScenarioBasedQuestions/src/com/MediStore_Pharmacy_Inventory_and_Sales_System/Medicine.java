package com.MediStore_Pharmacy_Inventory_and_Sales_System;

import java.time.LocalDate;

public abstract class Medicine implements ISellable {
    protected String name;
    protected double price;
    protected LocalDate expiryDate;
    private int quantity;   // encapsulated

    public Medicine(String name, double price, LocalDate expiryDate) {
        this(name, price, expiryDate, 10); // default quantity
    }

    public Medicine(String name, double price, LocalDate expiryDate, int quantity) {
        this.name = name;
        this.price = price;
        this.expiryDate = expiryDate;
        this.quantity = quantity;
    }

    protected void reduceStock(int qty) {
        quantity -= qty;
    }

    protected int getQuantity() {
        return quantity;
    }

    protected double calculateTotalPrice(int qty) {
        return price * qty;
    }
}

