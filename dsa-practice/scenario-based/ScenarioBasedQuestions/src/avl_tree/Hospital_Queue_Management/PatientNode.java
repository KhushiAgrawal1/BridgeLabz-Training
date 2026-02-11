package avl_tree.Hospital_Queue_Management;

public class PatientNode {
    int checkInTime;
    String patientName;
    int height;
    PatientNode left, right;

    public PatientNode(int checkInTime, String patientName) {
        this.checkInTime = checkInTime;
        this.patientName = patientName;
        this.height = 1;
    }
}
