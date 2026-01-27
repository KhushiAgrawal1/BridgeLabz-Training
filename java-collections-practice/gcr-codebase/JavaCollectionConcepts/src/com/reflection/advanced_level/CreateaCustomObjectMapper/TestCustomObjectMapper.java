package com.reflection.advanced_level.CreateaCustomObjectMapper;

import java.util.HashMap;
import java.util.Map;

public class TestCustomObjectMapper {

    public static void main(String[] args) {
        // Map with field names and values
        Map<String, Object> properties = new HashMap<>();
        properties.put("name", "Alice");
        properties.put("age", 30);
        properties.put("active", true);
        properties.put("nonExistingField", "test"); // Will be ignored

        // Convert Map to Person object
        Person person = CustomObjectMapper.toObject(Person.class, properties);

        System.out.println(person);
    }
}

