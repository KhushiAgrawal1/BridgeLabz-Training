package com.java_generics.Smart_Warehouse_Management_System;

public class Groceries extends WarehouseItem {

    public Groceries(String name) {
        super(name);
    }

    @Override
    public String getCategory() {
        return "Groceries";
    }
}

