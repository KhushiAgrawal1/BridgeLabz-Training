package com.reflection.advanced_level.CreateInjectAnnotation;

import java.lang.reflect.Field;

public class SimpleDIContainer {

    // Create instance of class and inject dependencies
    public static <T> T createInstance(Class<T> clazz) {
        try {
            // 1️⃣ Create instance of the target class
            T obj = clazz.getDeclaredConstructor().newInstance();

            // 2️⃣ Scan fields for @Inject annotation
            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields) {
                if (field.isAnnotationPresent(Inject.class)) {
                    // 3️⃣ Create instance of dependency
                    Class<?> fieldType = field.getType();
                    Object dependency = fieldType.getDeclaredConstructor().newInstance();

                    // 4️⃣ Make private fields accessible and inject
                    field.setAccessible(true);
                    field.set(obj, dependency);
                }
            }

            return obj;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

