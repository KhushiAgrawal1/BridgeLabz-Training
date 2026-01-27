package com.annotations.intermediate_level;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;

public class MaxLengthDemo {

    // 1️⃣ Define custom field-level annotation
    @Retention(RetentionPolicy.RUNTIME) // Available at runtime
    @interface MaxLength {
        int value(); // Maximum allowed length
    }

    // 2️⃣ User class with annotated field
    static class User {

        @MaxLength(10) // Max 10 characters
        private String username;

        public User(String username) {
            this.username = username;
            validateFields(); // Validate fields on object creation
        }

        // 3️⃣ Validation method using Reflection
        private void validateFields() {
            try {
                Field[] fields = this.getClass().getDeclaredFields();
                for (Field field : fields) {
                    if (field.isAnnotationPresent(MaxLength.class)) {
                        field.setAccessible(true);
                        Object value = field.get(this);

                        if (value instanceof String) {
                            int maxLength = field.getAnnotation(MaxLength.class).value();
                            String strValue = (String) value;

                            if (strValue.length() > maxLength) {
                                throw new IllegalArgumentException(
                                    "Field '" + field.getName() + "' exceeds max length of " + maxLength
                                );
                            }
                        }
                    }
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        @Override
        public String toString() {
            return "User{username='" + username + "'}";
        }
    }

    // 4️⃣ Main method to test
    public static void main(String[] args) {
        try {
            User user1 = new User("Alice"); // Valid
            System.out.println(user1);

            User user2 = new User("SuperLongUsername"); // Exceeds max length
            System.out.println(user2);

        } catch (IllegalArgumentException e) {
            System.out.println("Validation Error: " + e.getMessage());
        }
    }
}
