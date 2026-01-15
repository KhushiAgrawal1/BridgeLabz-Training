package com.java_generics.Smart_Warehouse_Management_System;

public abstract class WarehouseItem {
    protected String name;

    public WarehouseItem(String name) {
        this.name = name;
    }

    public abstract String getCategory();

    public String getName() {
        return name;
    }
}

