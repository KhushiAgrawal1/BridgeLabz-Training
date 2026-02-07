package com.multithreading.Thread_State_Monitoring_System;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

public class StateMonitor extends Thread {

    private Thread[] threads;
    private Map<String, Integer> stateCount = new HashMap<>();

    public StateMonitor(Thread[] threads) {
        this.threads = threads;
    }

    @Override
    public void run() {
        boolean allTerminated = false;

        while (!allTerminated) {
            allTerminated = true;

            for (Thread t : threads) {
                Thread.State state = t.getState();
                String time = LocalTime.now().withNano(0).toString();

                System.out.println("[Monitor] " + t.getName()
                        + " is in " + state + " state at " + time);

                // Count state observations
                stateCount.put(t.getName(),
                        stateCount.getOrDefault(t.getName(), 0) + 1);

                if (state != Thread.State.TERMINATED) {
                    allTerminated = false;
                }
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Monitor interrupted.");
            }
        }

        // Summary
        System.out.println("\nSummary of state observations:");
        for (Map.Entry<String, Integer> entry : stateCount.entrySet()) {
            System.out.println(entry.getKey()
                    + " observed " + entry.getValue() + " times.");
        }
    }
}

