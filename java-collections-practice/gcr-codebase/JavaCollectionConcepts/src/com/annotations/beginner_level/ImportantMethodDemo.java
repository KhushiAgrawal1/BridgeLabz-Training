package com.annotations.beginner_level;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

public class ImportantMethodDemo {

    // 1️⃣ Define custom annotation
    @Retention(RetentionPolicy.RUNTIME) // available at runtime
    @interface ImportantMethod {
        String level() default "HIGH"; // optional parameter with default
    }

    // 2️⃣ Class with annotated methods
    static class TaskManager {

        @ImportantMethod // default level HIGH
        public void criticalTask() {
            System.out.println("Executing critical task...");
        }

        @ImportantMethod(level = "MEDIUM")
        public void regularTask() {
            System.out.println("Executing regular task...");
        }

        public void normalTask() {
            System.out.println("Executing normal task...");
        }
    }

    // 3️⃣ Main method to retrieve annotated methods
    public static void main(String[] args) {
        try {
            Class<TaskManager> clazz = TaskManager.class;
            Method[] methods = clazz.getDeclaredMethods();

            System.out.println("Important Methods in TaskManager:");
            for (Method method : methods) {
                if (method.isAnnotationPresent(ImportantMethod.class)) {
                    ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);
                    System.out.println("- " + method.getName() + " (Level: " + annotation.level() + ")");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

