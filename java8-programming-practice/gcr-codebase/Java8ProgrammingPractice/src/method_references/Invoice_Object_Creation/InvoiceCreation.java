package method_references.Invoice_Object_Creation;

import java.util.*;

public class InvoiceCreation {
    public static void main(String[] args) {

        List<Integer> transactionIds = Arrays.asList(5001, 5002, 5003);

        List<Invoice> invoices =
                transactionIds.stream()
                              .map(Invoice::new)   // Constructor Reference
                              .toList();

        invoices.forEach(System.out::println);
    }
}

