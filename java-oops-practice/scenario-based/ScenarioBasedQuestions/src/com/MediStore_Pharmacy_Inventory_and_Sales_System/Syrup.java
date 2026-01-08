package com.MediStore_Pharmacy_Inventory_and_Sales_System;

import java.time.LocalDate;

public class Syrup extends Medicine {

    public Syrup(String name, double price, LocalDate expiryDate) {
        super(name, price, expiryDate);
    }

    @Override
    public void sell(int qty) {
        if (getQuantity() >= qty && !checkExpiry()) {
            reduceStock(qty);
            System.out.println("Syrup sold. Total: ₹" + calculateTotalPrice(qty));
        }
    }

    // Liquid medicine expires faster
    @Override
    public boolean checkExpiry() {
        return expiryDate.minusDays(30).isBefore(LocalDate.now());
    }
}

