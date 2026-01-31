package com.json_practice;

import java.util.*;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ListToJsonArray {

    public static void main(String[] args) throws Exception {

        // Create list of Java objects
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Khushi", 21));
        students.add(new Student(2, "Aman", 22));
        students.add(new Student(3, "Riya", 20));

        // Convert list to JSON array
        ObjectMapper mapper = new ObjectMapper();
        String jsonArray = mapper.writeValueAsString(students);

        System.out.println(jsonArray);
    }
}
