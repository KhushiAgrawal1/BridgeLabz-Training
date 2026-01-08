package com.TourMate_Travel_Itinerary_Planner;

public class DomesticTrip extends Trip {

    public DomesticTrip(String destination, int duration,
                        double hotel, double transport, double activity) {
        super(destination, duration, hotel, transport, activity);
    }

    @Override
    public void book() {
        System.out.println("Domestic trip booked to " + destination +
                " | Budget: ₹" + getBudget());
    }

    @Override
    public void cancel() {
        System.out.println("Domestic trip cancelled");
    }
}
