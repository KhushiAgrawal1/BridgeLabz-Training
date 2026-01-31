package method_references.Invoice_Object_Creation;

class Invoice {
    int transactionId;

    Invoice(int transactionId) {
        this.transactionId = transactionId;
    }

    public String toString() {
        return "Invoice for Transaction ID: " + transactionId;
    }
}

