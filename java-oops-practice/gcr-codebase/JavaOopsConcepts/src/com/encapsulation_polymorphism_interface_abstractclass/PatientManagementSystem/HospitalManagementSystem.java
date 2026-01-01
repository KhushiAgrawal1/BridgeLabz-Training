package com.encapsulation_polymorphism_interface_abstractclass.PatientManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class HospitalManagementSystem {

    public static void main(String[] args) {

        List<Patient> patients = new ArrayList<>();

        Patient p1 = new InPatient(101, "Ramesh", 45, 5, 3000);
        Patient p2 = new OutPatient(102, "Sita", 30, 800);

        ((MedicalRecord) p1).addRecord("Appendicitis", "Surgery done");
        ((MedicalRecord) p2).addRecord("Fever", "Prescribed medication");

        patients.add(p1);
        patients.add(p2);

        // Polymorphism
        for (Patient p : patients) {
            p.getPatientDetails();
            System.out.println("Total Bill: ₹" + p.calculateBill());

            if (p instanceof MedicalRecord) {
                ((MedicalRecord) p).viewRecords();
            }

            System.out.println("--------------------------");
        }
    }
}

