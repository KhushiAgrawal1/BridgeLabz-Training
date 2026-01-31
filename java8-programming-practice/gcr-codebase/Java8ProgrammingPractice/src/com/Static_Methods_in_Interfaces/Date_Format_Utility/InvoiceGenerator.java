package com.Static_Methods_in_Interfaces.Date_Format_Utility;

import java.time.LocalDate;

public class InvoiceGenerator {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        System.out.println("Invoice Date (DD-MM-YYYY): "
                + DateUtils.formatDate(today, "dd-MM-yyyy"));

        System.out.println("Invoice Date (YYYY/MM/DD): "
                + DateUtils.formatDate(today, "yyyy/MM/dd"));

        System.out.println("Invoice Date (Full): "
                + DateUtils.formatDate(today, "dd MMM yyyy"));
    }
}

