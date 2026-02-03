package com.Workshop;

public class BusService implements TransportService {
	public String getName() {
		return "Bus";
	}
	public double getFare() {
		return 20;
	}
	public String getRoute() {
		return "A-B";
	}
	public int getDepartureTime() {
		return 9;
	}
}
