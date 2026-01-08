package com.FitTrack_Personal_Fitness_Tracker;

public class FitTrackMain {
    public static void main(String[] args) {

        UserProfile user = new UserProfile("Aman", 22, 70, "Weight Loss");

        Workout w = new CardioWorkout(30);   // Polymorphism
        ITrackable tracker = (ITrackable) w;

        tracker.startWorkout();
        int calories = w.calculateCalories();
        tracker.stopWorkout();

        int dailyTarget = 500;
        System.out.println("Progress: " + (dailyTarget - calories));
    }
}

