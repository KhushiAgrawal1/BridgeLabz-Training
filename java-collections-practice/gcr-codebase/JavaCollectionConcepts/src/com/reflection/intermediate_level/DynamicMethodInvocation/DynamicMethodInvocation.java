package com.reflection.intermediate_level.DynamicMethodInvocation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class DynamicMethodInvocation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // 1️⃣ Load the class
            Class<?> clazz = MathOperations.class;

            // 2️⃣ Create instance dynamically
            Object mathObj = clazz.getDeclaredConstructor().newInstance();

            // 3️⃣ Get user input
            System.out.print("Enter method name (add, subtract, multiply): ");
            String methodName = scanner.nextLine();

            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();

            // 4️⃣ Get method dynamically
            Method method = clazz.getMethod(methodName, int.class, int.class);

            // 5️⃣ Invoke method
            Object result = method.invoke(mathObj, num1, num2);

            System.out.println("Result: " + result);

        } catch (NoSuchMethodException e) {
            System.out.println("Invalid method name!");
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
