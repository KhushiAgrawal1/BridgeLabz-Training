package com.Marker_Interfaces.Data_Serialization_for_Backup;

class InvoiceData implements BackupSerializable {
    int invoiceId;
    double amount;

    InvoiceData(int invoiceId, double amount) {
        this.invoiceId = invoiceId;
        this.amount = amount;
    }
}

