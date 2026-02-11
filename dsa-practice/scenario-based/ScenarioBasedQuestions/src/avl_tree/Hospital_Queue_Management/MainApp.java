package avl_tree.Hospital_Queue_Management;

public class MainApp {
    public static void main(String[] args) {

        PatientAVL avl = new PatientAVL();

        // Scenario 1: Patient registration
        avl.root = avl.insert(avl.root, 900, "Amit");
        avl.root = avl.insert(avl.root, 845, "Neha");
        avl.root = avl.insert(avl.root, 915, "Rahul");
        avl.root = avl.insert(avl.root, 830, "Priya");

        // Scenario 3: Display by arrival time
        System.out.println("Patient Queue:");
        avl.inOrder(avl.root);

        // Scenario 2: Discharge patient
        System.out.println("\nDischarging patient at 845...");
        avl.root = avl.delete(avl.root, 845);

        System.out.println("\nQueue after discharge:");
        avl.inOrder(avl.root);
    }
}
