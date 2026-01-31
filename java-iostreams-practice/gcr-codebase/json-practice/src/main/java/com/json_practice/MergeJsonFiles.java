package com.json_practice;

import java.io.File;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class MergeJsonFiles {

    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();

        try {
            // Read first JSON file
            JsonNode json1 = mapper.readTree(new File("C:\\Users\\agraw\\Desktop\\Java Programming Workspace\\java-iostreams-practice\\gcr-codebase\\json-practice\\src\\main\\java\\com\\json_practice\\user1.json"));

            // Read second JSON file
            JsonNode json2 = mapper.readTree(new File("C:\\Users\\agraw\\Desktop\\Java Programming Workspace\\java-iostreams-practice\\gcr-codebase\\json-practice\\src\\main\\java\\com\\json_practice\\user2.json"));

            // Merge JSON2 into JSON1
            ObjectNode merged = ((ObjectNode) json1).setAll((ObjectNode) json2);

            // Print merged JSON
            String mergedJson = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(merged);
            System.out.println(mergedJson);

        } catch (Exception e) {
            System.out.println("❌ Error merging JSON files");
            e.printStackTrace();
        }
    }
}

