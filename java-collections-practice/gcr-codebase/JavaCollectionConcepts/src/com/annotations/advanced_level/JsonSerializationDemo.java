package com.annotations.advanced_level;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;

public class JsonSerializationDemo {

    // 1️⃣ Define custom annotation
    @Retention(RetentionPolicy.RUNTIME)
    @interface JsonField {
        String name(); // Custom JSON key
    }

    // 2️⃣ User class with annotated fields
    static class User {

        @JsonField(name = "user_name")
        private String username;

        @JsonField(name = "user_email")
        private String email;

        private int age; // Not annotated → not serialized

        public User(String username, String email, int age) {
            this.username = username;
            this.email = email;
            this.age = age;
        }
    }

    // 3️⃣ Convert object to JSON using Reflection
    public static String toJson(Object obj) {
        StringBuilder json = new StringBuilder("{");

        Field[] fields = obj.getClass().getDeclaredFields();

        try {
            for (Field field : fields) {
                if (field.isAnnotationPresent(JsonField.class)) {
                    field.setAccessible(true);

                    JsonField annotation = field.getAnnotation(JsonField.class);
                    String jsonKey = annotation.name();
                    Object value = field.get(obj);

                    json.append("\"")
                        .append(jsonKey)
                        .append("\":\"")
                        .append(value)
                        .append("\",");
                }
            }

            // Remove trailing comma
            if (json.charAt(json.length() - 1) == ',') {
                json.deleteCharAt(json.length() - 1);
            }

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        json.append("}");
        return json.toString();
    }

    // 4️⃣ Main method to test
    public static void main(String[] args) {
        User user = new User("khushi123", "khushi@gmail.com", 22);

        String json = toJson(user);
        System.out.println("Serialized JSON:");
        System.out.println(json);
    }
}
