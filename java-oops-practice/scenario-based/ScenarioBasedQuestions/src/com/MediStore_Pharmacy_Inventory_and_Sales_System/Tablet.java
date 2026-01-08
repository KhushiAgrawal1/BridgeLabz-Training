package com.MediStore_Pharmacy_Inventory_and_Sales_System;

import java.time.LocalDate;

public class Tablet extends Medicine {

    public Tablet(String name, double price, LocalDate expiryDate) {
        super(name, price, expiryDate);
    }

    @Override
    public void sell(int qty) {
        if (getQuantity() >= qty && !checkExpiry()) {
            reduceStock(qty);
            System.out.println("Tablet sold. Total: ₹" + calculateTotalPrice(qty));
        }
    }

    @Override
    public boolean checkExpiry() {
        return expiryDate.isBefore(LocalDate.now());
    }
}

