package com.json_practice;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class IPLCsvProcessor {

    public static void processCsv(String inputPath, String outputPath) throws Exception {
    	try (CSVReader reader = new CSVReader(new FileReader(inputPath));
    		     CSVWriter writer = new CSVWriter(new FileWriter(outputPath))) {

    		    List<String[]> allRows = reader.readAll();
    		    List<String[]> outputRows = new ArrayList<>();
    		    outputRows.add(allRows.get(0));

    		    for (int i = 1; i < allRows.size(); i++) {
    		        String[] row = allRows.get(i);
    		        String[] newRow = row.clone();

    		        newRow[1] = CensorshipUtils.maskTeamName(row[1]);
    		        newRow[2] = CensorshipUtils.maskTeamName(row[2]);
    		        newRow[5] = CensorshipUtils.maskTeamName(row[5]);
    		        newRow[6] = CensorshipUtils.redactPlayer(row[6]);

    		        outputRows.add(newRow);
    		    }

    		    writer.writeAll(outputRows);
    		    System.out.println("Censored CSV written to: " + outputPath);
    		}

    }
}

