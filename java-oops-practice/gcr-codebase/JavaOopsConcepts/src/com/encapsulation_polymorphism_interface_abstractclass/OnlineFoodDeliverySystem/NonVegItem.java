package com.encapsulation_polymorphism_interface_abstractclass.OnlineFoodDeliverySystem;

public class NonVegItem extends FoodItem implements Discountable {

    private static final double NON_VEG_CHARGE = 50;

    public NonVegItem(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + NON_VEG_CHARGE;
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.05; // 5% discount
    }

    @Override
    public String getDiscountDetails() {
        return "Non-Veg Discount (5%) applied";
    }
}
