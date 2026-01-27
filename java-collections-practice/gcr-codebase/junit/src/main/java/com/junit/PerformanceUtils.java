package com.junit;

public class PerformanceUtils {

    public String longRunningTask() throws InterruptedException {
        // Simulate long processing
        Thread.sleep(3000); // 3 seconds
        return "Completed";
    }
}

