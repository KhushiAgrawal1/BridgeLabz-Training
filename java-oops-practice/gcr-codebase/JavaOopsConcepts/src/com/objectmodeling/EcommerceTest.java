package com.objectmodeling;

public class EcommerceTest {
    public static void main(String[] args) {

        Customer1 c1 = new Customer1("Khushi");
        Order o1 = new Order();

        Product p1 = new Product("Laptop", 50000);
        Product p2 = new Product("Mouse", 500);

        o1.addProduct(p1);
        o1.addProduct(p2);

        c1.placeOrder(o1);
    }
}
