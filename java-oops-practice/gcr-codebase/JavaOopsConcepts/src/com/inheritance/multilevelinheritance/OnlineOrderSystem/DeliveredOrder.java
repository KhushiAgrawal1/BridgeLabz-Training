package com.inheritance.multilevelinheritance.OnlineOrderSystem;

 class DeliveredOrder extends ShippedOrder {
	String deliveryDate;

	DeliveredOrder(int orderId, String orderDate, int trackingNumber, String deliveryDate) {
		super(orderId, orderDate, trackingNumber );
		this.deliveryDate = deliveryDate;
	}
	
	@Override
	void getOrderStatus() {
		super.getOrderStatus();
		System.out.println("Order Delivery Date : " + deliveryDate);
	}
}
