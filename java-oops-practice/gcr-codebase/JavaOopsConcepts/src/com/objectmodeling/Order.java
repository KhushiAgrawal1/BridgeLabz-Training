package com.objectmodeling;

import java.util.ArrayList;

public class Order {
    ArrayList<Product> products = new ArrayList<>();

    void addProduct(Product p) {
        products.add(p);
    }
}

