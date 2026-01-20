package PayXpress_Utility_Bill_Payment_System;

class Bill implements IPayable {

    protected String type;
    protected double amount;
    protected String dueDate;
    private boolean isPaid;          // encapsulated
    private double paymentDetails;   // internal only

    // Constructor for recurring bills
    public Bill(String type, double amount, String dueDate) {
        this.type = type;
        this.amount = amount;
        this.dueDate = dueDate;
        this.isPaid = false;
    }

    // Operator usage: late fee calculation
    public double calculateLateFee(double penalty) {
        return amount + penalty;
    }

    @Override
    public void pay() {
        if (!isPaid) {
            paymentDetails = amount;
            isPaid = true;
            System.out.println(type + " bill paid successfully");
        } else {
            System.out.println(type + " bill already paid");
        }
    }

    @Override
    public void sendReminder() {
        System.out.println("Bill payment reminder");
    }

    public boolean isPaid() {
        return isPaid;
    }
}
