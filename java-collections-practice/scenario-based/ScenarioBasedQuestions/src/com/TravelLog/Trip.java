package com.TravelLog;

import java.io.Serializable;

public class Trip implements Serializable {
    String city;
    String country;
    int duration; // in days
    String notes;

    public Trip(String city, String country, int duration, String notes) {
        this.city = city;
        this.country = country;
        this.duration = duration;
        this.notes = notes;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public int getDuration() {
        return duration;
    }

    public String getNotes() {
        return notes;
    }

    @Override
    public String toString() {
        return city + ", " + country + " - " + duration + " days";
    }
}

