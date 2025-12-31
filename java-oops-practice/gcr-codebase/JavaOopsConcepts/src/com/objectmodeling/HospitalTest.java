package com.objectmodeling;

public class HospitalTest {
    public static void main(String[] args) {

        Doctor d1 = new Doctor("Verma");
        Patient p1 = new Patient("Riya");

        d1.consult(p1);
    }
}
