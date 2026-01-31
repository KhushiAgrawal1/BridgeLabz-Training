package com.Default_Methods_in_Interfaces.Data_Export_Feature;

class SalesReportExporter implements ReportExporter {

    public void exportToCSV() {
        System.out.println("Sales report exported to CSV");
    }

    public void exportToPDF() {
        System.out.println("Sales report exported to PDF");
    }
}

