package com.FitTrack_Personal_Fitness_Tracker;

public class StrengthWorkout extends Workout implements ITrackable {

    public StrengthWorkout(int duration) {
        this.type = "Strength";
        this.duration = duration;
    }

    @Override
    public int calculateCalories() {
        caloriesBurned = duration * 10;
        return caloriesBurned;
    }

    public void startWorkout() {
        System.out.println("Strength workout started");
    }

    public void stopWorkout() {
        System.out.println("Strength workout stopped");
    }
}

