package com.annotations.beginner_level;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

public class TodoAnnotationDemo {

    // 1️⃣ Define custom @Todo annotation
    @Retention(RetentionPolicy.RUNTIME) // Available at runtime
    @interface Todo {
        String task();          // Task description
        String assignedTo();    // Developer responsible
        String priority() default "MEDIUM"; // Optional, default MEDIUM
    }

    // 2️⃣ Class with methods annotated with @Todo
    static class Project {

        @Todo(task = "Implement login feature", assignedTo = "Alice", priority = "HIGH")
        public void login() {
            System.out.println("Login feature under development...");
        }

        @Todo(task = "Add search functionality", assignedTo = "Bob")
        public void search() {
            System.out.println("Search feature pending...");
        }

        @Todo(task = "Improve UI responsiveness", assignedTo = "Charlie", priority = "LOW")
        public void uiEnhancements() {
            System.out.println("UI enhancements pending...");
        }

        public void completedTask() {
            System.out.println("Completed task...");
        }
    }

    // 3️⃣ Main method to retrieve all @Todo annotations
    public static void main(String[] args) {
        try {
            Class<Project> clazz = Project.class;
            Method[] methods = clazz.getDeclaredMethods();

            System.out.println("Pending Tasks in Project:");
            for (Method method : methods) {
                if (method.isAnnotationPresent(Todo.class)) {
                    Todo todo = method.getAnnotation(Todo.class);
                    System.out.println("- Method: " + method.getName());
                    System.out.println("  Task: " + todo.task());
                    System.out.println("  Assigned To: " + todo.assignedTo());
                    System.out.println("  Priority: " + todo.priority());
                    System.out.println();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

