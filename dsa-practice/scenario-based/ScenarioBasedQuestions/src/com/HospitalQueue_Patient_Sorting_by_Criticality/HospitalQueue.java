package com.HospitalQueue_Patient_Sorting_by_Criticality;

class HospitalQueue {

    static class Patient {
        String name;
        int criticality; // 1 (low) to 10 (high)

        Patient(String name, int criticality) {
            this.name = name;
            this.criticality = criticality;
        }
    }

    // Bubble Sort by criticality (Descending)
    static void sortByCriticality(Patient[] patients) {
        int n = patients.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (patients[j].criticality < patients[j + 1].criticality) {
                    Patient temp = patients[j];
                    patients[j] = patients[j + 1];
                    patients[j + 1] = temp;
                }
            }
        }
    }

    static void display(Patient[] patients) {
        for (Patient p : patients) {
            System.out.println(p.name + " | Criticality: " + p.criticality);
        }
    }

    public static void main(String[] args) {
        Patient[] patients = {
            new Patient("Amit", 4),
            new Patient("Riya", 9),
            new Patient("Neha", 6),
            new Patient("Rahul", 2)
        };

        System.out.println("Before Sorting:");
        display(patients);

        sortByCriticality(patients);

        System.out.println("\nAfter Sorting:");
        display(patients);
    }
}

