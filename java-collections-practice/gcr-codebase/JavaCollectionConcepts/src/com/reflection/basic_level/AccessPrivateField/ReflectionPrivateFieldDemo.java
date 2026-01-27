package com.reflection.basic_level.AccessPrivateField;

import java.lang.reflect.Field;

public class ReflectionPrivateFieldDemo {

    public static void main(String[] args) {
        try {
            // Create Person object
            Person person = new Person(25);
            System.out.println("Original age: " + person.getAge());

            // Get Class object
            Class<?> clazz = person.getClass();

            // Access private field 'age'
            Field ageField = clazz.getDeclaredField("age");

            // Make private field accessible
            ageField.setAccessible(true);

            // Modify value
            ageField.setInt(person, 40);

            // Retrieve value
            int modifiedAge = ageField.getInt(person);
            System.out.println("Modified age: " + modifiedAge);

        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}

