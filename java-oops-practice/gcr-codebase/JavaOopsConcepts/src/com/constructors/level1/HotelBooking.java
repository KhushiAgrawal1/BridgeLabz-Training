package com.constructors.level1;

public class HotelBooking {
	String guestName;
	String roomType;
	int nights;
	
	HotelBooking() {
		guestName = "Guest";
		roomType = "Standard";
		nights = 1;
	}
	
    HotelBooking(String guestName, String roomType, int nights) {
		this.guestName = guestName;
		this.roomType = roomType;
		this.nights = nights;
	}
    
    HotelBooking(HotelBooking h) {
    	this.guestName = h.guestName;
		this.roomType = h.roomType;
		this.nights = h.nights;
	}
    
    void getDetails() {
    	System.out.println("Name : " + guestName);
    	System.out.println("Type : " + roomType);
    	System.out.println("Nights : " + nights);
    }
    
    public static void main(String[] args) {
    	HotelBooking h1 = new HotelBooking();
    	h1.getDetails();
    	
    	HotelBooking h2 = new HotelBooking("Tanisha", "AC", 2);
    	h2.getDetails();
    	
    	HotelBooking h3 = new HotelBooking(h1);
    	h3.getDetails();
    	
    }
	

}
