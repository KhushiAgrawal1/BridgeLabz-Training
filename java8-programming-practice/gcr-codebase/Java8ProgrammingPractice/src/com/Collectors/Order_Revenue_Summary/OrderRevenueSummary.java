package com.Collectors.Order_Revenue_Summary;

import java.util.*;
import java.util.stream.Collectors;

public class OrderRevenueSummary {

    public static void main(String[] args) {

        List<Order> orders = Arrays.asList(
                new Order("Rahul", 200),
                new Order("Neha", 150),
                new Order("Rahul", 300),
                new Order("Neha", 100),
                new Order("Aman", 400)
        );

        Map<String, Double> revenueByCustomer =
                orders.stream()
                        .collect(Collectors.groupingBy(
                                order -> order.customer,          // group by customer
                                Collectors.summingDouble(
                                        order -> order.amount      // sum amounts
                                )
                        ));

        System.out.println(revenueByCustomer);
    }
}

