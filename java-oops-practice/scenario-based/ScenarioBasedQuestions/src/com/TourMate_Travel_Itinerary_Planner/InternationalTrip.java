package com.TourMate_Travel_Itinerary_Planner;

public class InternationalTrip extends Trip {

    public InternationalTrip(String destination, int duration,
                             double hotel, double transport, double activity) {
        super(destination, duration, hotel, transport, activity);
    }

    @Override
    public void book() {
        System.out.println("International trip booked to " + destination +
                " | Budget: ₹" + getBudget());
    }

    @Override
    public void cancel() {
        System.out.println("International trip cancelled with charges");
    }
}
