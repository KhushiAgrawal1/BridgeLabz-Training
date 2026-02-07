package com.multithreading.Thread_State_Monitoring_System;

public class ThreadStateDemo {
    public static void main(String[] args) {

        TaskRunner task1 = new TaskRunner("Task-1");
        TaskRunner task2 = new TaskRunner("Task-2");

        Thread[] tasks = {task1, task2};

        // Create monitor
        StateMonitor monitor = new StateMonitor(tasks);

        // Show initial states (NEW)
        System.out.println("Initial thread states:");
        for (Thread t : tasks) {
            System.out.println(t.getName() + " - " + t.getState());
        }

        // Start tasks
        task1.start();
        task2.start();

        // Start monitor
        monitor.start();

        try {
            task1.join();
            task2.join();
            monitor.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

