package com.annotations.advanced_level;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

public class RoleBasedAccessDemo {

    // 1️⃣ Define custom annotation for roles
    @Retention(RetentionPolicy.RUNTIME) // Available at runtime
    @interface RoleAllowed {
        String value(); // Role name
    }

    // 2️⃣ Class with role-protected methods
    static class AdminTasks {

        @RoleAllowed("ADMIN")
        public void deleteUser() {
            System.out.println("User deleted successfully.");
        }

        @RoleAllowed("ADMIN")
        public void modifySettings() {
            System.out.println("Settings modified successfully.");
        }

        public void viewDashboard() {
            System.out.println("Viewing dashboard (no role restriction).");
        }
    }

    // 3️⃣ Method to simulate role-based access
    static void executeMethod(Object obj, String methodName, String userRole) {
        try {
            Method method = obj.getClass().getDeclaredMethod(methodName);

            if (method.isAnnotationPresent(RoleAllowed.class)) {
                RoleAllowed roleAllowed = method.getAnnotation(RoleAllowed.class);

                if (roleAllowed.value().equals(userRole)) {
                    method.invoke(obj); // Execute method
                } else {
                    System.out.println("Access Denied! User role: " + userRole);
                }
            } else {
                // No role restriction
                method.invoke(obj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 4️⃣ Main method to test
    public static void main(String[] args) {
        AdminTasks tasks = new AdminTasks();

        String adminUser = "ADMIN";
        String regularUser = "USER";

        System.out.println("=== Admin User Access ===");
        executeMethod(tasks, "deleteUser", adminUser);
        executeMethod(tasks, "modifySettings", adminUser);
        executeMethod(tasks, "viewDashboard", adminUser);

        System.out.println("\n=== Regular User Access ===");
        executeMethod(tasks, "deleteUser", regularUser);
        executeMethod(tasks, "modifySettings", regularUser);
        executeMethod(tasks, "viewDashboard", regularUser);
    }
}
