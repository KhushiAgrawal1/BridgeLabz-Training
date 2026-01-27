package com.reflection.advanced_level.MethodExecutionTiming;

public class MathOperations {

    public void longTask() {
        try {
            Thread.sleep(500); // Simulate a long-running task
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void shortTask() {
        try {
            Thread.sleep(100); // Simulate a short task
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

