package com.encapsulation_polymorphism_interface_abstractclass.PatientManagementSystem;

public class OutPatient extends Patient implements MedicalRecord {

    private double consultationFee;

    public OutPatient(int id, String name, int age, double consultationFee) {
        super(id, name, age);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String diagnosis, String history) {
        setMedicalData(diagnosis, history);
    }

    @Override
    public void viewRecords() {
        System.out.println(getMedicalData());
    }
}
