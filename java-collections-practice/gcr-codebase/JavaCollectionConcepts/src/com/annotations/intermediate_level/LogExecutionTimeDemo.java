package com.annotations.intermediate_level;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

public class LogExecutionTimeDemo {

    // 1️⃣ Define custom annotation
    @Retention(RetentionPolicy.RUNTIME) // Available at runtime
    @interface LogExecutionTime {
    }

    // 2️⃣ Class with methods annotated to measure execution time
    static class TaskProcessor {

        @LogExecutionTime
        public void longTask() {
            try {
                Thread.sleep(500); // Simulate long task
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        @LogExecutionTime
        public void shortTask() {
            try {
                Thread.sleep(100); // Simulate short task
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public void normalTask() {
            System.out.println("Normal task with no timing...");
        }
    }

    // 3️⃣ Main method to measure execution time
    public static void main(String[] args) {
        try {
            TaskProcessor processor = new TaskProcessor();
            Class<TaskProcessor> clazz = TaskProcessor.class;
            Method[] methods = clazz.getDeclaredMethods();

            for (Method method : methods) {
                if (method.isAnnotationPresent(LogExecutionTime.class)) {
                    long startTime = System.nanoTime();
                    method.invoke(processor); // Execute method
                    long endTime = System.nanoTime();

                    long durationMs = (endTime - startTime) / 1_000_000;
                    System.out.println("Execution time of " + method.getName() + ": " + durationMs + " ms");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
