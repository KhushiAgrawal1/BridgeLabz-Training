package com.json_practice;

import java.io.File;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadJsonFile {
    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        // Read JSON file
        JsonNode rootNode = mapper.readTree(
                new File("C:\\Users\\agraw\\Desktop\\Java Programming Workspace\\java-iostreams-practice\\gcr-codebase\\json-practice\\src\\main\\java\\com\\json_practice\\user.json")
        );

        // Extract specific fields
        String name = rootNode.get("name").asText();
        String email = rootNode.get("email").asText();

        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }
}

