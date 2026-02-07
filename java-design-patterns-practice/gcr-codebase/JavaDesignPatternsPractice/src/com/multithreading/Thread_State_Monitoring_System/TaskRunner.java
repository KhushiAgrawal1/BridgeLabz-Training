package com.multithreading.Thread_State_Monitoring_System;

public class TaskRunner extends Thread {

    public TaskRunner(String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            // Simulate work before sleep (RUNNABLE)
            for (int i = 0; i < 3; i++) {
                System.out.println(getName() + " performing computation...");
            }

            // Sleep to enter TIMED_WAITING
            System.out.println(getName() + " going to sleep...");
            Thread.sleep(2000);

            // Final computation
            System.out.println(getName() + " finishing task...");

        } catch (InterruptedException e) {
            System.out.println(getName() + " was interrupted.");
        }
    }
}
