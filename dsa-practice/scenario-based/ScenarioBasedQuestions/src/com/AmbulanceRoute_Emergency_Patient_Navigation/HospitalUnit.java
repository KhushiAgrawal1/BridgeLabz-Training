package com.AmbulanceRoute_Emergency_Patient_Navigation;

public class HospitalUnit {
    String name;
    boolean available; // true = can take patient, false = under maintenance
    HospitalUnit next;

    public HospitalUnit(String name) {
        this.name = name;
        this.available = true; // by default, unit is available
        this.next = null;
    }

    @Override
    public String toString() {
        return name + (available ? " (Available)" : " (Under Maintenance)");
    }
}
