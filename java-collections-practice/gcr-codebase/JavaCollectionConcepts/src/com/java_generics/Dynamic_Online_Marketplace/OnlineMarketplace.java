package com.java_generics.Dynamic_Online_Marketplace;

public class OnlineMarketplace {
    public static void main(String[] args) {

        Product<BookCategory> book =
                new Product<>("Java Programming", 500, new BookCategory());

        Product<ClothingCategory> shirt =
                new Product<>("Cotton Shirt", 1200, new ClothingCategory());

        Product<GadgetCategory> phone =
                new Product<>("Smartphone", 15000, new GadgetCategory());

        ProductCatalog catalog = new ProductCatalog();
        catalog.addProduct(book);
        catalog.addProduct(shirt);
        catalog.addProduct(phone);

        System.out.println("---- Product Catalog Before Discount ----");
        catalog.displayCatalog();

        DiscountUtility.applyDiscount(book, 10);
        DiscountUtility.applyDiscount(phone, 5);

        System.out.println("\n---- Product Catalog After Discount ----");
        catalog.displayCatalog();
    }
}
