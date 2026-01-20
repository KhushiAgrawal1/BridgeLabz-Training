package PayXpress_Utility_Bill_Payment_System;

class WaterBill extends Bill {

    public WaterBill(double amount, String dueDate) {
        super("Water", amount, dueDate);
    }

    @Override
    public void sendReminder() {
        System.out.println("Water Bill Reminder: Pay before " + dueDate);
    }
}

