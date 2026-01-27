package com.reflection.advanced_level.CreateaCustomObjectMapper;

import java.lang.reflect.Field;
import java.util.Map;

public class CustomObjectMapper {

    // Generic method to map properties to object
    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) {
        try {
            // 1️⃣ Create object using default constructor
            T obj = clazz.getDeclaredConstructor().newInstance();

            // 2️⃣ Loop through all properties
            for (Map.Entry<String, Object> entry : properties.entrySet()) {
                String fieldName = entry.getKey();
                Object fieldValue = entry.getValue();

                try {
                    // 3️⃣ Get Field object
                    Field field = clazz.getDeclaredField(fieldName);

                    // 4️⃣ Make private field accessible
                    field.setAccessible(true);

                    // 5️⃣ Set field value
                    field.set(obj, fieldValue);

                } catch (NoSuchFieldException e) {
                    System.out.println("No such field: " + fieldName);
                }
            }

            return obj;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
