package com.SwiftCart_Grocery_Shopping_App;

import java.util.ArrayList;

public class Cart implements ICheckout {

    private ArrayList<Product> products = new ArrayList<>();
    private double totalPrice;

    public Cart() {}

    public Cart(ArrayList<Product> products) {
        this.products = products;
        calculateTotal();
    }

    public void addProduct(Product product) {
        products.add(product);
        totalPrice += product.getPrice();
    }

    private void calculateTotal() {
        for (Product p : products) {
            totalPrice += p.getPrice();
        }
    }

    public void applyDiscount() {
        for (Product p : products) {
            if (p instanceof PerishableProduct) {
                totalPrice = ((PerishableProduct) p).applyDiscount(totalPrice);
            } else if (p instanceof NonPerishableProduct) {
                totalPrice = ((NonPerishableProduct) p).applyDiscount(totalPrice);
            }
        }
    }

    public void generateBill() {
        System.out.println("Total Amount: ₹" + totalPrice);
    }
}

