package com.Functional_Interfaces;

public class BackgroundJob {
    public static void main(String[] args) {

        // Runnable using lambda
        Runnable job = () -> {
            System.out.println("Background job started...");
            try {
                Thread.sleep(2000); // simulate task
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Background job completed");
        };

        // Run asynchronously
        Thread thread = new Thread(job);
        thread.start();

        System.out.println("Main thread continues...");
    }
}
