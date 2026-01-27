package com.annotations;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

public class RepeatableAnnotationDemo {

    // 1️⃣ Container annotation required for repeatable annotations
    @Retention(RetentionPolicy.RUNTIME)
    @interface BugReports {
        BugReport[] value();
    }

    // 2️⃣ Repeatable annotation
    @Retention(RetentionPolicy.RUNTIME)
    @Repeatable(BugReports.class)
    @interface BugReport {
        String description();
    }

    // 3️⃣ Class with method annotated multiple times
    static class Task {

        @BugReport(description = "Null pointer exception on line 42")
        @BugReport(description = "Incorrect calculation in sum method")
        public void calculate() {
            System.out.println("Calculating...");
        }
    }

    // 4️⃣ Main method to retrieve all bug reports
    public static void main(String[] args) {
        try {
            Class<Task> clazz = Task.class;
            Method method = clazz.getDeclaredMethod("calculate");

            // Retrieve repeatable annotations
            if (method.isAnnotationPresent(BugReport.class) || method.isAnnotationPresent(BugReports.class)) {
                BugReport[] reports = method.getAnnotationsByType(BugReport.class);
                System.out.println("Bug Reports for method: " + method.getName());
                for (BugReport report : reports) {
                    System.out.println("- " + report.description());
                }
            }

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
