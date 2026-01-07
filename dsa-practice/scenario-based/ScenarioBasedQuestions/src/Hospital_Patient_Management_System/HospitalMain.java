package Hospital_Patient_Management_System;

public class HospitalMain {
    public static void main(String[] args) {
        Patient p = new InPatient(101, "Riya", "Asthma");
        Doctor d = new Doctor("Dr. Mehta", "Physician");
        Bill bill = new Bill(4000);

        p.displayInfo();
        d.displayInfo();
        System.out.println("Total Bill: ₹" + bill.calculatePayment());
    }
}

