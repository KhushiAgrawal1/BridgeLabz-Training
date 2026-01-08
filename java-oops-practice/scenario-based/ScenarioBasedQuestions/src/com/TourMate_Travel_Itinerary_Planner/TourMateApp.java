package com.TourMate_Travel_Itinerary_Planner;

public class TourMateApp {
    public static void main(String[] args) {

        Trip trip = new InternationalTrip(
                "Paris",
                7,
                70000,
                50000,
                30000
        );

        trip.book();
        trip.cancel();
    }
}

