package com.Workshop;

public class MetroService implements TransportService {
	public String getName() {
		return "Metro";
	}
	public double getFare() {
		return 40;
	}
	public String getRoute() {
		return "A-C";
	}
	public int getDepartureTime() {
		return 8;
	}

}
