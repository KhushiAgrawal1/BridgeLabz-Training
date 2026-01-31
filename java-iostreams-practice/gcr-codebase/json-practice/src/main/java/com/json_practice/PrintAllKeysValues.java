package com.json_practice;

import java.io.File;
import java.util.Iterator;
import java.util.Map;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PrintAllKeysValues {

    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();

        try {
            // Read JSON file
            JsonNode rootNode = mapper.readTree(new File("C:\\Users\\agraw\\Desktop\\Java Programming Workspace\\java-iostreams-practice\\gcr-codebase\\json-practice\\src\\main\\java\\com\\json_practice\\user.json"));

            // Iterate over all fields
            Iterator<Map.Entry<String, JsonNode>> fields = rootNode.fields();

            while (fields.hasNext()) {
                Map.Entry<String, JsonNode> entry = fields.next();
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }

        } catch (Exception e) {
            System.out.println("❌ Error reading JSON file");
            e.printStackTrace();
        }
    }
}
