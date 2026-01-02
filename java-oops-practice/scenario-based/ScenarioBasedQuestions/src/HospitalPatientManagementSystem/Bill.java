package HospitalPatientManagementSystem;

public class Bill implements Payable {
    private double amount;

    public Bill(double amount) {
        this.amount = amount;
    }

    @Override
    public double calculatePayment() {
        double tax = amount * 0.05;
        return amount + tax;
    }
}
