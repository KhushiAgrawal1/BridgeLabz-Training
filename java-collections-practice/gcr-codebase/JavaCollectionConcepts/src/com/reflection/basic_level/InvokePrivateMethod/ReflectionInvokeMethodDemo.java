package com.reflection.basic_level.InvokePrivateMethod;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionInvokeMethodDemo {

    public static void main(String[] args) {
        try {
            // Create Calculator object
            Calculator calculator = new Calculator();

            // Get Class object
            Class<?> clazz = calculator.getClass();

            // Access private method 'multiply' with parameters (int, int)
            Method multiplyMethod = clazz.getDeclaredMethod("multiply", int.class, int.class);

            // Make private method accessible
            multiplyMethod.setAccessible(true);

            // Invoke method on object with arguments
            int result = (int) multiplyMethod.invoke(calculator, 5, 6);

            System.out.println("Result of multiply(5, 6): " + result);

        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
