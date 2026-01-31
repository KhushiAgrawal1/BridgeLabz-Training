package com.json_practice;

public class IPLCensorApp {

    public static void main(String[] args) {
        try {
            // JSON processing
            IPLJsonProcessor.processJson("C:\\Users\\agraw\\Desktop\\Java Programming Workspace\\java-iostreams-practice\\gcr-codebase\\json-practice\\src\\main\\java\\com\\json_practice\\input.json", "C:\\Users\\agraw\\Desktop\\Java Programming Workspace\\java-iostreams-practice\\gcr-codebase\\json-practice\\src\\main\\java\\com\\json_practice\\ipl_matches_censored.json");

            // CSV processing
            IPLCsvProcessor.processCsv("C:\\Users\\agraw\\Desktop\\Java Programming Workspace\\java-iostreams-practice\\gcr-codebase\\json-practice\\src\\main\\java\\com\\json_practice\\input.csv", "C:\\Users\\agraw\\Desktop\\Java Programming Workspace\\java-iostreams-practice\\gcr-codebase\\json-practice\\src\\main\\java\\com\\json_practice\\ipl_matches_censored.csv");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

