package com.Default_Methods_in_Interfaces.Data_Export_Feature;

class AdvancedReportExporter implements ReportExporter {

    public void exportToCSV() {
        System.out.println("Advanced report exported to CSV");
    }

    public void exportToPDF() {
        System.out.println("Advanced report exported to PDF");
    }

    // Custom JSON implementation
    public void exportToJSON() {
        System.out.println("Advanced report exported to JSON");
    }
}
