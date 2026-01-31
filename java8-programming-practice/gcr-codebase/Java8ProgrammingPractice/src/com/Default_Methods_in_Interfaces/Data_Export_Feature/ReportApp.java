package com.Default_Methods_in_Interfaces.Data_Export_Feature;

public class ReportApp {
    public static void main(String[] args) {

        ReportExporter r1 = new SalesReportExporter();
        ReportExporter r2 = new AdvancedReportExporter();

        r1.exportToCSV();
        r1.exportToJSON();   // default method

        r2.exportToPDF();
        r2.exportToJSON();   // overridden
    }
}

