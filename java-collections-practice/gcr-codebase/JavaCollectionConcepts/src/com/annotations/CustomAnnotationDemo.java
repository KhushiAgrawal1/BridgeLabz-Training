package com.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

public class CustomAnnotationDemo {

    // 1️⃣ Define custom annotation
    @Retention(RetentionPolicy.RUNTIME) // Make it available at runtime
    @interface TaskInfo {
        String priority();
        String assignedTo();
    }

    // 2️⃣ Class with annotated method
    static class TaskManager {

        @TaskInfo(priority = "High", assignedTo = "Alice")
        public void completeTask() {
            System.out.println("Task is being completed...");
        }

        @TaskInfo(priority = "Low", assignedTo = "Bob")
        public void reviewTask() {
            System.out.println("Task is under review...");
        }
    }

    // 3️⃣ Main method to retrieve annotation using Reflection
    public static void main(String[] args) {
        try {
            Class<TaskManager> clazz = TaskManager.class;
            Method[] methods = clazz.getDeclaredMethods();

            for (Method method : methods) {
                if (method.isAnnotationPresent(TaskInfo.class)) {
                    TaskInfo taskInfo = method.getAnnotation(TaskInfo.class);

                    System.out.println("Method: " + method.getName());
                    System.out.println("Priority: " + taskInfo.priority());
                    System.out.println("Assigned To: " + taskInfo.assignedTo());
                    System.out.println();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

