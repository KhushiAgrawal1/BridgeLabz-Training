package com.json_practice;

import java.io.File;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class MergeJsonObjects {
    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        JsonNode json1 = mapper.readTree(new File("C:\\Users\\agraw\\Desktop\\Java Programming Workspace\\java-iostreams-practice\\gcr-codebase\\json-practice\\src\\main\\java\\com\\json_practice\\json1.json"));
        JsonNode json2 = mapper.readTree(new File("C:\\Users\\agraw\\Desktop\\Java Programming Workspace\\java-iostreams-practice\\gcr-codebase\\json-practice\\src\\main\\java\\com\\json_practice\\json2.json"));

        ObjectNode mergedJson = mapper.createObjectNode();

        mergedJson.setAll((ObjectNode) json1);
        mergedJson.setAll((ObjectNode) json2);

        System.out.println(mergedJson.toPrettyString());
    }
}

