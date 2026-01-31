package com.json_practice;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ListToJsonArray2 {

    public static void main(String[] args) throws Exception {

        // Create list of Java objects
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Khushi", 21));
        students.add(new Student(2, "Aman", 28));
        students.add(new Student(3, "Riya", 25));

        // Convert list to JSON array
        ObjectMapper mapper = new ObjectMapper();
        String jsonArray = mapper
                .writerWithDefaultPrettyPrinter()
                .writeValueAsString(students);


        System.out.println(jsonArray);
    }
}
