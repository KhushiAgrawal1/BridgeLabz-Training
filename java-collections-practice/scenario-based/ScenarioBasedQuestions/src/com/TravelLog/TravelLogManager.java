package com.TravelLog;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class TravelLogManager {

    // Save trips to file
    public void saveTrips(List<Trip> trips, String fileName) {
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(trips);
        } catch (IOException e) {
            System.out.println("Error saving trips.");
        }
    }

    // Load trips from file
    public List<Trip> loadTrips(String fileName) {
        List<Trip> trips = new ArrayList<>();

        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(fileName))) {
            trips = (List<Trip>) ois.readObject();
        } catch (Exception e) {
            System.out.println("No trip data found.");
        }

        return trips;
    }

    // Regex search for cities
    public void searchCity(List<Trip> trips, String pattern) {
        Pattern p = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);

        System.out.println("Matching Cities:");
        for (Trip t : trips) {
            Matcher m = p.matcher(t.getCity());
            if (m.find()) {
                System.out.println(t);
            }
        }
    }

    // Trips longer than 5 days
    public void longTrips(List<Trip> trips) {
        System.out.println("\nTrips longer than 5 days:");
        for (Trip t : trips) {
            if (t.getDuration() > 5) {
                System.out.println(t);
            }
        }
    }

    // Unique countries using Set
    public void uniqueCountries(List<Trip> trips) {
        Set<String> countries = new HashSet<>();

        for (Trip t : trips) {
            countries.add(t.getCountry());
        }

        System.out.println("\nUnique countries visited:");
        for (String c : countries) {
            System.out.println(c);
        }
    }

    // Top 3 cities using Map
    public void topCities(List<Trip> trips) {
        Map<String, Integer> cityCount = new HashMap<>();

        for (Trip t : trips) {
            cityCount.put(t.getCity(),
                    cityCount.getOrDefault(t.getCity(), 0) + 1);
        }

        List<Map.Entry<String, Integer>> list =
                new ArrayList<>(cityCount.entrySet());

        list.sort((a, b) -> b.getValue() - a.getValue());

        System.out.println("\nTop 3 visited cities:");
        for (int i = 0; i < Math.min(3, list.size()); i++) {
            System.out.println(list.get(i).getKey()
                    + " - " + list.get(i).getValue() + " visits");
        }
    }
}

