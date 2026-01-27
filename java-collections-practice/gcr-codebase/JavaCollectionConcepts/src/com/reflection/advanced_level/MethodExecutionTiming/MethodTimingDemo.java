package com.reflection.advanced_level.MethodExecutionTiming;

import java.lang.reflect.Method;

public class MethodTimingDemo {

    public static void main(String[] args) {
        try {
            // 1️⃣ Get Class object
            Class<MathOperations> clazz = MathOperations.class;

            // 2️⃣ Create instance dynamically
            MathOperations obj = clazz.getDeclaredConstructor().newInstance();

            // 3️⃣ Get all methods
            Method[] methods = clazz.getDeclaredMethods();

            for (Method method : methods) {
                // 4️⃣ Measure start time
                long startTime = System.nanoTime();

                // 5️⃣ Invoke method dynamically
                method.invoke(obj);

                // 6️⃣ Measure end time
                long endTime = System.nanoTime();

                long duration = endTime - startTime;

                System.out.println("Execution time of " + method.getName() + ": " + duration / 1_000_000 + " ms");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

