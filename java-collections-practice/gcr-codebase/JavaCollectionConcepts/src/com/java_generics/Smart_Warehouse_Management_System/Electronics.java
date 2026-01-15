package com.java_generics.Smart_Warehouse_Management_System;

public class Electronics extends WarehouseItem {

    public Electronics(String name) {
        super(name);
    }

    @Override
    public String getCategory() {
        return "Electronics";
    }
}

