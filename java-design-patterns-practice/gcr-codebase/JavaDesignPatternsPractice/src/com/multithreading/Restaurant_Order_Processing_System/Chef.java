package com.multithreading.Restaurant_Order_Processing_System;

public class Chef extends Thread {

    private String dish;
    private int totalTime; // in milliseconds

    public Chef(String chefName, String dish, int totalTime) {
        super(chefName); // set thread name
        this.dish = dish;
        this.totalTime = totalTime;
    }

    @Override
    public void run() {
        System.out.println(getName() + " started preparing " + dish);

        int stepTime = totalTime / 4; // divide time into 4 steps
        int[] progress = {25, 50, 75, 100};

        for (int p : progress) {
            try {
                Thread.sleep(stepTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(getName() + " preparing " + dish + ": " + p + "% complete");
        }

        System.out.println(getName() + " completed " + dish);
    }
}

