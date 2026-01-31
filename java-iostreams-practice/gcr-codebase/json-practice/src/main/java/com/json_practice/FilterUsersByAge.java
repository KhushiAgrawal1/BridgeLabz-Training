package com.json_practice;

import java.io.File;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FilterUsersByAge {

    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();

        try {
            // Read JSON array from file
            JsonNode rootNode = mapper.readTree(new File("C:\\Users\\agraw\\Desktop\\Java Programming Workspace\\java-iostreams-practice\\gcr-codebase\\json-practice\\src\\main\\java\\com\\json_practice\\users.json"));

            System.out.println("Users with age > 25:");

            for (JsonNode user : rootNode) {
                int age = user.get("age").asInt();

                if (age > 25) {
                    System.out.println(
                        "Name: " + user.get("name").asText() +
                        ", Age: " + age
                    );
                }
            }

        } catch (Exception e) {
            System.out.println("❌ Error reading JSON file");
            e.printStackTrace();
        }
    }
}

