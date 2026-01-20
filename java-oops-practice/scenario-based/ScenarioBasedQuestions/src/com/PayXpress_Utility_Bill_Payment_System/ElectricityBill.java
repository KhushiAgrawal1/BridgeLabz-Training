package PayXpress_Utility_Bill_Payment_System;

class ElectricityBill extends Bill {

    public ElectricityBill(double amount, String dueDate) {
        super("Electricity", amount, dueDate);
    }

    @Override
    public void sendReminder() {
        System.out.println("Electricity Bill Reminder: Due on " + dueDate);
    }
}
