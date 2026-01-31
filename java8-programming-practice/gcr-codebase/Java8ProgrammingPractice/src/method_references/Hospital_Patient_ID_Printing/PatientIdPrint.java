package method_references.Hospital_Patient_ID_Printing;

import java.util.*;

public class PatientIdPrint {
    public static void main(String[] args) {

        List<Patient> patients = Arrays.asList(
            new Patient(101),
            new Patient(102),
            new Patient(103)
        );

        // Method Reference instead of lambda
        patients.stream()
                .map(Patient::getId)
                .forEach(System.out::println);
    }
}
