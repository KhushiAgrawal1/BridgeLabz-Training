package com.json_practice;

import java.io.File;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class JsonToXml {

    public static void main(String[] args) {
        try {
            // Read JSON
            ObjectMapper jsonMapper = new ObjectMapper();
            JsonNode jsonNode = jsonMapper.readTree(new File("C:\\Users\\agraw\\Desktop\\Java Programming Workspace\\java-iostreams-practice\\gcr-codebase\\json-practice\\src\\main\\java\\com\\json_practice\\user_email.json"));

            // Convert JSON to XML
            XmlMapper xmlMapper = new XmlMapper();
            String xml = xmlMapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonNode);

            // Print XML
            System.out.println(xml);

        } catch (Exception e) {
            System.out.println("❌ Error converting JSON to XML");
            e.printStackTrace();
        }
    }
}

