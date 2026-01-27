package com.reflection.intermediate_level.AccessandModifyStaticFields;

import java.lang.reflect.Field;

public class ModifyStaticFieldDemo {

    public static void main(String[] args) {
        try {
            // 1️⃣ Get Class object
            Class<Configuration> clazz = Configuration.class;

            // 2️⃣ Access private static field 'API_KEY'
            Field apiKeyField = clazz.getDeclaredField("API_KEY");

            // 3️⃣ Make it accessible
            apiKeyField.setAccessible(true);

            // 4️⃣ Modify the static field (pass null for static)
            apiKeyField.set(null, "NEW_KEY");

            // 5️⃣ Retrieve value to verify
            String updatedKey = (String) apiKeyField.get(null);
            System.out.println("Updated API_KEY: " + updatedKey);

        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}

