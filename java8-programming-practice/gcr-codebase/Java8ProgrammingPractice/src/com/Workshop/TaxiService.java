package com.Workshop;

public class TaxiService implements TransportService {
	public String getName() {
		return "Taxi";
	}
	public double getFare() {
		return 60;
	}
	public String getRoute() {
		return "B-C";
	}
	public int getDepartureTime() {
		return 7;
	}
}
