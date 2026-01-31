package lambda_expressions.Custom_Sorting_in_ECommerce;

import java.util.*;

public class EcommerceSorting {
    public static void main(String[] args) {

        List<Product> products = Arrays.asList(
            new Product("Mobile", 15000, 4.5, 10),
            new Product("Laptop", 55000, 4.7, 15),
            new Product("Headphones", 2000, 4.2, 20)
        );

        // Sort by Price
        products.sort((p1, p2) -> Double.compare(p1.price, p2.price));
        System.out.println("Sorted by Price:");
        products.forEach(System.out::println);

        // Sort by Rating (High to Low)
        products.sort((p1, p2) -> Double.compare(p2.rating, p1.rating));
        System.out.println("\nSorted by Rating:");
        products.forEach(System.out::println);

        // Sort by Discount (High to Low)
        products.sort((p1, p2) -> Double.compare(p2.discount, p1.discount));
        System.out.println("\nSorted by Discount:");
        products.forEach(System.out::println);
    }
}
