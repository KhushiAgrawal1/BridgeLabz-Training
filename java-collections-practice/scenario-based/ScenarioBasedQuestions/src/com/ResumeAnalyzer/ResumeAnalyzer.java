package com.ResumeAnalyzer;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ResumeAnalyzer {

    Map<String, ResumeData> resumeMap = new HashMap<>();

    // Regex patterns
    private static final Pattern EMAIL_PATTERN =
            Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");

    private static final Pattern PHONE_PATTERN =
            Pattern.compile("\\b\\d{10}\\b");

    private static final Pattern KEYWORD_PATTERN =
            Pattern.compile("\\b(Java|Python|Spring)\\b", Pattern.CASE_INSENSITIVE);

    // Read resumes from folder
    public void readResumes(String folderPath) {
        File folder = new File(folderPath);
        File[] files = folder.listFiles();

        if (files == null) {
            System.out.println("Folder not found");
            return;
        }

        for (File file : files) {
            try {
                if (file.getName().endsWith(".txt")) {
                    processFile(file);
                }
            } catch (Exception e) {
                System.out.println("Skipping invalid resume: " + file.getName());
            }
        }
    }

    // Process single file
    private void processFile(File file) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        StringBuilder content = new StringBuilder();
        String line;

        while ((line = br.readLine()) != null) {
            content.append(line).append(" ");
        }
        br.close();

        String text = content.toString();

        String email = extract(EMAIL_PATTERN, text);
        String phone = extract(PHONE_PATTERN, text);
        int keywordCount = countKeywords(text);

        if (email == null) {
            throw new RuntimeException("Invalid resume");
        }

        ResumeData data = new ResumeData(email, phone, keywordCount);
        resumeMap.put(email, data);
    }

    // Extract first match
    private String extract(Pattern pattern, String text) {
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            return matcher.group();
        }
        return null;
    }

    // Count keywords
    private int countKeywords(String text) {
        Matcher matcher = KEYWORD_PATTERN.matcher(text);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }

    // Get sorted candidates
    public List<ResumeData> getSortedCandidates() {
        List<ResumeData> list = new ArrayList<>(resumeMap.values());

        Collections.sort(list, (a, b) ->
                b.getKeywordCount() - a.getKeywordCount());

        return list;
    }
}

