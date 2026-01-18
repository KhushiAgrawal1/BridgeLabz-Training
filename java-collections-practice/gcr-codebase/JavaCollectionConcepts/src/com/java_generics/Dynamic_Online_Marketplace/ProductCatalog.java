package com.java_generics.Dynamic_Online_Marketplace;

import java.util.*;

class ProductCatalog {
    private List<Product<? extends Category>> products = new ArrayList<>();

    public void addProduct(Product<? extends Category> product) {
        products.add(product);
    }

    public void displayCatalog() {
        for (Product<? extends Category> product : products) {
            product.displayProduct();
        }
    }
}
