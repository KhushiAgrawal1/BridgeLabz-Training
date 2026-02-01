package com.Marker_Interfaces.Sensitive_Data_Tagging;

class BankDetails implements SensitiveData {
    String accountNumber;
    String ifsc;

    BankDetails(String accountNumber, String ifsc) {
        this.accountNumber = accountNumber;
        this.ifsc = ifsc;
    }
}

