package com.inheritance.multilevelinheritance.OnlineOrderSystem;

public class OnlineOrder {

	public static void main(String[] args) {
		DeliveredOrder o1 = new DeliveredOrder(1545, "12/12/2025", 256546, "15/12/2025");
		o1.getOrderStatus();
	}

}
