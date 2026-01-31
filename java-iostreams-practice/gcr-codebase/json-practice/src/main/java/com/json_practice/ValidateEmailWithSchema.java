package com.json_practice;

import java.io.InputStream;
import java.util.Set;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.networknt.schema.JsonSchema;
import com.networknt.schema.JsonSchemaFactory;
import com.networknt.schema.SpecVersion;
import com.networknt.schema.ValidationMessage;

public class ValidateEmailWithSchema {

    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();

        try {
            // Load JSON from resources
            InputStream jsonStream = ValidateEmailWithSchema.class
                    .getClassLoader()
                    .getResourceAsStream("C:\\Users\\agraw\\Desktop\\Java Programming Workspace\\java-iostreams-practice\\gcr-codebase\\json-practice\\src\\main\\java\\com\\json_practice\\user_email.json");

            JsonNode jsonNode = mapper.readTree(jsonStream);

            // Load JSON Schema from resources
            InputStream schemaStream = ValidateEmailWithSchema.class
                    .getClassLoader()
                    .getResourceAsStream("C:\\Users\\agraw\\Desktop\\Java Programming Workspace\\java-iostreams-practice\\gcr-codebase\\json-practice\\src\\main\\java\\com\\json_practice\\user_email_schema.json");

            JsonSchemaFactory factory = JsonSchemaFactory.getInstance(SpecVersion.VersionFlag.V7);
            JsonSchema schema = factory.getSchema(schemaStream);

            // Validate JSON
            Set<ValidationMessage> errors = schema.validate(jsonNode);

            if (errors.isEmpty()) {
                System.out.println("✅ JSON is valid. Email format is correct.");
            } else {
                System.out.println("❌ JSON is invalid:");
                errors.forEach(System.out::println);
            }

        } catch (Exception e) {
            System.out.println("❌ Error validating JSON");
            e.printStackTrace();
        }
    }
}
