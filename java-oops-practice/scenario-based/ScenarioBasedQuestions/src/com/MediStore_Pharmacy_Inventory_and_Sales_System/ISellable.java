package com.MediStore_Pharmacy_Inventory_and_Sales_System;

public interface ISellable {
    void sell(int quantity);
    boolean checkExpiry();
}

