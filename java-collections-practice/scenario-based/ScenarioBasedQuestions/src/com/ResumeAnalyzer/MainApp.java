package com.ResumeAnalyzer;

import java.util.List;

public class MainApp {
    public static void main(String[] args) {

        ResumeAnalyzer analyzer = new ResumeAnalyzer();

        // Folder containing resumes
        analyzer.readResumes("resumes");

        // Get sorted candidates
        List<ResumeData> candidates = analyzer.getSortedCandidates();

        System.out.println("Sorted Candidates:");
        for (ResumeData r : candidates) {
            System.out.println(r);
        }
    }
}

