package com.encapsulation_polymorphism_interface_abstractclass.OnlineFoodDeliverySystem;

public class VegItem extends FoodItem implements Discountable {

    public VegItem(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.10; // 10% discount
    }

    @Override
    public String getDiscountDetails() {
        return "Veg Discount (10%) applied";
    }
}
