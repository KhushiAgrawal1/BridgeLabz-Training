package com.FitTrack_Personal_Fitness_Tracker;

public class Workout {
    protected String type;
    protected int duration;
    protected int caloriesBurned;

    public int calculateCalories() {
        return caloriesBurned;
    }
}

