package com.reflection.basic_level.DynamicallyCreateObjects;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionCreateObjectDemo {

    public static void main(String[] args) {
        try {
            // 1️⃣ Get Class object
            Class<?> clazz = Class.forName("Student");

            // 2️⃣ Get the constructor with parameters (String, int)
            Constructor<?> constructor = clazz.getConstructor(String.class, int.class);

            // 3️⃣ Create object dynamically using constructor
            Object studentObj = constructor.newInstance("Alice", 20);

            // 4️⃣ Call displayInfo method dynamically
            clazz.getMethod("displayInfo").invoke(studentObj);

        } catch (ClassNotFoundException | NoSuchMethodException |
                 InstantiationException | IllegalAccessException |
                 InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}

