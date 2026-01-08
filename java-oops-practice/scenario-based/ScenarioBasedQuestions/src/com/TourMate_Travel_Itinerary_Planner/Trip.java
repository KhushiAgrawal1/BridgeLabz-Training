package com.TourMate_Travel_Itinerary_Planner;

public abstract class Trip implements IBookable {
    protected String destination;
    protected int duration;
    private double budget;

    protected double hotelCost;
    protected double transportCost;
    protected double activityCost;

    public Trip(String destination, int duration,
                double hotelCost, double transportCost, double activityCost) {

        this.destination = destination;
        this.duration = duration;
        this.hotelCost = hotelCost;
        this.transportCost = transportCost;
        this.activityCost = activityCost;
        calculateBudget();
    }

    private void calculateBudget() {
        budget = hotelCost + transportCost + activityCost;
    }

    public double getBudget() {
        return budget;
    }
}

