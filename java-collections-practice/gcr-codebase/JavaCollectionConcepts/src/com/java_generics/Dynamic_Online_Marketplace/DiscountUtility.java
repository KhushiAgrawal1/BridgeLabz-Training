package com.java_generics.Dynamic_Online_Marketplace;

class DiscountUtility {

    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double discount = product.getPrice() * (percentage / 100);
        product.setPrice(product.getPrice() - discount);
    }
}


