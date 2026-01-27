package com.reflection.basic_level;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class ReflectionDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter fully qualified class name: ");
        String className = scanner.nextLine();

        try {
            // Load the class
            Class<?> clazz = Class.forName(className);

            System.out.println("\nClass Name: " + clazz.getName());

            // Display Fields
            System.out.println("\nFields:");
            Field[] fields = clazz.getDeclaredFields();
            if (fields.length == 0) {
                System.out.println("No fields found.");
            }
            for (Field field : fields) {
                System.out.println("  " + field);
            }

            // Display Methods
            System.out.println("\nMethods:");
            Method[] methods = clazz.getDeclaredMethods();
            if (methods.length == 0) {
                System.out.println("No methods found.");
            }
            for (Method method : methods) {
                System.out.println("  " + method);
            }

            // Display Constructors
            System.out.println("\nConstructors:");
            Constructor<?>[] constructors = clazz.getDeclaredConstructors();
            if (constructors.length == 0) {
                System.out.println("No constructors found.");
            }
            for (Constructor<?> constructor : constructors) {
                System.out.println("  " + constructor);
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + className);
        } finally {
            scanner.close();
        }
    }
}

