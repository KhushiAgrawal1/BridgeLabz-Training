package com.EventEase_Event_Management_Platform;

public class Event implements ISchedulable {

    private final int eventId;
    protected String eventName;
    protected String location;
    protected String date;
    protected int attendees;

    private double cost;

    public Event(int eventId, String eventName, String location,
                 String date, int attendees, double baseCost) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.location = location;
        this.date = date;
        this.attendees = attendees;
        this.cost = baseCost;
    }

    protected void updateCost(double value) {
        cost += value;
    }

    public double getCost() {
        return cost;
    }

    public void schedule() {
        System.out.println("Event scheduled: " + eventName);
    }

    public void reschedule(String newDate) {
        date = newDate;
        System.out.println("Event rescheduled to " + newDate);
    }

    public void cancel() {
        System.out.println("Event cancelled");
    }
}

