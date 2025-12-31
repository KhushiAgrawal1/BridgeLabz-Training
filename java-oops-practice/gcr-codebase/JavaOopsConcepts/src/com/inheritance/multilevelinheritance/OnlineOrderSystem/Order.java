package com.inheritance.multilevelinheritance.OnlineOrderSystem;

 class Order {
	
	int orderId;
	String orderDate;
	
	Order(int orderId, String orderDate){
		this.orderId = orderId;
		this.orderDate = orderDate;
	}
	
	void getOrderStatus() {
		System.out.println("Order Id : " + orderId);
		System.out.println("Order Date : " + orderDate);
	}

}
