package com.java_generics.Smart_Warehouse_Management_System;

public class Furniture extends WarehouseItem {

    public Furniture(String name) {
        super(name);
    }

    @Override
    public String getCategory() {
        return "Furniture";
    }
}

