package com.TravelLog;

import java.util.*;

public class MainApp {
    public static void main(String[] args) {

        TravelLogManager manager = new TravelLogManager();
        String fileName = "trips.dat";

        // Create sample trips
        List<Trip> trips = new ArrayList<>();
        trips.add(new Trip("Paris", "France", 7, "Great food"));
        trips.add(new Trip("Rome", "Italy", 4, "Historic places"));
        trips.add(new Trip("Paris", "France", 3, "Second visit"));
        trips.add(new Trip("Tokyo", "Japan", 8, "Amazing culture"));
        trips.add(new Trip("Delhi", "India", 6, "Family trip"));

        // Save trips
        manager.saveTrips(trips, fileName);

        // Load trips
        List<Trip> loadedTrips = manager.loadTrips(fileName);

        // Scenario operations
        manager.searchCity(loadedTrips, "Pa");   // regex search
        manager.longTrips(loadedTrips);          // >5 days
        manager.uniqueCountries(loadedTrips);    // set
        manager.topCities(loadedTrips);          // map
    }
}
