package com.inheritance.multilevelinheritance.OnlineOrderSystem;

class ShippedOrder extends Order {
	int trackingNumber;

	ShippedOrder(int orderId, String orderDate, int trackingNumber) {
		super(orderId, orderDate);
		this.trackingNumber = trackingNumber;
	}

	@Override
	void getOrderStatus() {
		super.getOrderStatus();
		System.out.println("Order tracking number : " + trackingNumber);
	}

}
