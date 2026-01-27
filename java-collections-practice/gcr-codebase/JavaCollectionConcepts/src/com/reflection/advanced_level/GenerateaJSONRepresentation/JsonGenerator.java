package com.reflection.advanced_level.GenerateaJSONRepresentation;

import java.lang.reflect.Field;

public class JsonGenerator {

    public static String toJson(Object obj) {
        if (obj == null) return "null";

        StringBuilder json = new StringBuilder();
        Class<?> clazz = obj.getClass();

        json.append("{");

        Field[] fields = clazz.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            field.setAccessible(true); // access private fields
            try {
                Object value = field.get(obj);
                json.append("\"").append(field.getName()).append("\":");

                if (value instanceof String) {
                    json.append("\"").append(value).append("\"");
                } else {
                    json.append(value);
                }

                if (i < fields.length - 1) {
                    json.append(", ");
                }

            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        json.append("}");
        return json.toString();
    }
}

