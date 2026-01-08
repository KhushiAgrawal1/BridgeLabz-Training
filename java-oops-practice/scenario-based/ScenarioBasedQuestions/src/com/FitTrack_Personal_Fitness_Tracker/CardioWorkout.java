package com.FitTrack_Personal_Fitness_Tracker;

public class CardioWorkout extends Workout implements ITrackable {

    public CardioWorkout(int duration) {
        this.type = "Cardio";
        this.duration = duration;
    }

    @Override
    public int calculateCalories() {
        caloriesBurned = duration * 8;
        return caloriesBurned;
    }

    public void startWorkout() {
        System.out.println("Cardio workout started");
    }

    public void stopWorkout() {
        System.out.println("Cardio workout stopped");
    }
}

