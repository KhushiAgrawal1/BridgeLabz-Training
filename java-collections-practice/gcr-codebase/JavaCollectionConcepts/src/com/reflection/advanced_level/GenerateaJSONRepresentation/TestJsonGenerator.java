package com.reflection.advanced_level.GenerateaJSONRepresentation;

public class TestJsonGenerator {

    public static void main(String[] args) {
        Person person = new Person("Alice", 30, true);

        String json = JsonGenerator.toJson(person);
        System.out.println(json);
    }
}

