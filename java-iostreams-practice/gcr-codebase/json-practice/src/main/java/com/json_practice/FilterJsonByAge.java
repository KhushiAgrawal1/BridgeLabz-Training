package com.json_practice;

import java.io.File;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;

public class FilterJsonByAge {

    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();

        try {
            // Read JSON array from file
            ArrayNode rootArray = (ArrayNode) mapper.readTree(new File("C:\\Users\\agraw\\Desktop\\Java Programming Workspace\\java-iostreams-practice\\gcr-codebase\\json-practice\\src\\main\\java\\com\\json_practice\\students.json"));

            System.out.println("Students with age > 25:");

            for (JsonNode node : rootArray) {
                int age = node.get("age").asInt();

                if (age > 25) {
                    System.out.println(
                        "Name: " + node.get("name").asText() +
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

