package com.Default_Methods_in_Interfaces.Data_Export_Feature;

interface ReportExporter {

    void exportToCSV();
    void exportToPDF();

    // New feature added later
    default void exportToJSON() {
        System.out.println("Exporting report in JSON format (default)");
    }
}

