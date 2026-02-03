package com.Workshop;

public interface TransportService {
	String getName();
	double getFare();
	String getRoute();
	int getDepartureTime();
	
	default void printServiceDetails() {
		System.out.println(getName() + " | Route: " + getRoute() + " | Fare: "
		+ getFare());
	}

}
