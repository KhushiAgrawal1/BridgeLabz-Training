package com.json_practice;
import java.util.Map;

import java.io.File;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

public class CsvToJson {

    public static void main(String[] args) {
        try {
            // CSV file
            File csvFile = new File("C:\\Users\\agraw\\Desktop\\Java Programming Workspace\\java-iostreams-practice\\gcr-codebase\\json-practice\\src\\main\\java\\com\\json_practice\\users.csv");

            // Define CSV schema (first row is header)
            CsvSchema schema = CsvSchema.emptySchema().withHeader();

            // Create CsvMapper
            CsvMapper csvMapper = new CsvMapper();

            // Read CSV as List<Object>
            List<Object> data = csvMapper.readerFor(Map.class)
                    .with(schema)
                    .readValues(csvFile)
                    .readAll();

            // Convert to JSON
            ObjectMapper jsonMapper = new ObjectMapper();
            String json = jsonMapper.writerWithDefaultPrettyPrinter().writeValueAsString(data);

            // Print JSON
            System.out.println(json);

        } catch (Exception e) {
            System.out.println("❌ Error converting CSV to JSON");
            e.printStackTrace();
        }
    }
}
