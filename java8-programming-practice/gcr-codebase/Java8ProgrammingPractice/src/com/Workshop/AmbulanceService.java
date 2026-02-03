package com.Workshop;

public class AmbulanceService implements TransportService,EmergencyService{
	public String getName() {
		return "Ambulance";
	}
	public double getFare() {
		return 0;
	}
	public String getRoute() {
		return "Emergency";
	}
	public int getDepartureTime() {
		return 0;
	}
}
