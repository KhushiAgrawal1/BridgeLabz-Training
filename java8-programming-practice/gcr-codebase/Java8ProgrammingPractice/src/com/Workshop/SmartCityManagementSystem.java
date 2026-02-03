package com.Workshop;

import java.util.*;
import java.util.stream.*;

public class SmartCityManagementSystem {
	public static void main(String[] args) {
		List<TransportService> services = Arrays.asList(
				new BusService(),
				new MetroService(),
				new TaxiService(),
				new AmbulanceService()	
				);
		
		services.stream()
		.filter(s ->
		s.getFare() <= 50)
		.sorted((s1,s2) ->
			s1.getDepartureTime() -s2.getDepartureTime()
		)
		.forEach(System.out::println);
		
		services.forEach(TransportService::printServiceDetails);
		
		services.forEach(s ->
			System.out.println("Live Service: " + s.getName())
				);
		
		FareCalculator calculator = d -> d * 5;
		double fare = calculator.calculateFare(GeoUtils.calculateDistance(10,20));
		System.out.println("Calculated Fare: " + fare);
		
		services.forEach(s -> {
            if (s instanceof EmergencyService) {
                System.out.println(
                    s.getName() + " can bypass traffic rules"
                );
            }
        });

        // Trips data for Stream + Collectors
        List<Trip> trips = Arrays.asList(
                new Trip("A-B", 20, true),
                new Trip("A-B", 25, false),
                new Trip("B-C", 60, true),
                new Trip("A-C", 40, false)
        );

        // groupingBy
        Map<String, List<Trip>> byRoute =
                trips.stream()
                     .collect(Collectors.groupingBy(Trip::getRoute));

        // partitioningBy
        Map<Boolean, List<Trip>> peakTrips =
                trips.stream()
                     .collect(Collectors.partitioningBy(Trip::isPeakTime));

        // summarizingDouble
        DoubleSummaryStatistics stats =
                trips.stream()
                     .collect(Collectors.summarizingDouble(Trip::getFare));

        System.out.println("Routes: " + byRoute.keySet());
        System.out.println("Peak Trips: " + peakTrips.get(true).size());
        System.out.println("Total Revenue: " + stats.getSum());
        System.out.println("Average Fare: " + stats.getAverage());
	}
	
}
