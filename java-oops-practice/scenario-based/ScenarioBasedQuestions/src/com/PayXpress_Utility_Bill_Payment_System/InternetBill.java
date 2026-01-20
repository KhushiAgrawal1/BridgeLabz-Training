package PayXpress_Utility_Bill_Payment_System;

class InternetBill extends Bill {

    public InternetBill(double amount, String dueDate) {
        super("Internet", amount, dueDate);
    }

    @Override
    public void sendReminder() {
        System.out.println("Internet Bill Reminder: Avoid service disruption!");
    }
}

