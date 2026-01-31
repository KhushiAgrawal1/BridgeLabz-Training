package com.json_practice;

import java.io.File;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ValidateJson {

    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();

        try {
            // Read JSON file from project root
            File file = new File("C:\\Users\\agraw\\Desktop\\Java Programming Workspace\\java-iostreams-practice\\gcr-codebase\\json-practice\\src\\main\\java\\com\\json_practice\\user.json");

            // Parse JSON
            JsonNode rootNode = mapper.readTree(file);

            // Validate required fields
            if (rootNode.has("name") && rootNode.has("email")) {
                System.out.println("✅ Valid JSON structure");
                System.out.println("Name  : " + rootNode.get("name").asText());
                System.out.println("Email : " + rootNode.get("email").asText());
            } else {
                System.out.println("❌ Invalid JSON: Required fields missing");
            }

        } catch (Exception e) {
            System.out.println("❌ Invalid JSON format");
            e.printStackTrace();
        }
    }
}

