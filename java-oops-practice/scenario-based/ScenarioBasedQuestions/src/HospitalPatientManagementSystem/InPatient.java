package HospitalPatientManagementSystem;

public class InPatient extends Patient {

    public InPatient(int id, String name, String history) {
        super(id, name, history);
    }

    @Override
    public void displayInfo() {
        System.out.println("In-Patient: " + name);
    }
}
