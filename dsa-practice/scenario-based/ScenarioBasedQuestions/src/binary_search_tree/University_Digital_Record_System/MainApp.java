package binary_search_tree.University_Digital_Record_System;

public class MainApp {
    public static void main(String[] args) {

        StudentBST bst = new StudentBST();

        // Scenario 1: Insert students
        bst.root = bst.insert(bst.root, 105, "Amit");
        bst.root = bst.insert(bst.root, 102, "Neha");
        bst.root = bst.insert(bst.root, 110, "Rahul");
        bst.root = bst.insert(bst.root, 101, "Priya");

        // Scenario 3: Display sorted list
        System.out.println("Student list (sorted by roll number):");
        bst.inOrder(bst.root);

        // Search
        System.out.println("\nSearching for roll number 102:");
        StudentNode s = bst.search(bst.root, 102);
        if (s != null) {
            System.out.println("Found: " + s.name);
        } else {
            System.out.println("Student not found");
        }

        // Scenario 2: Delete student
        System.out.println("\nDeleting roll number 105...");
        bst.root = bst.delete(bst.root, 105);

        System.out.println("After deletion:");
        bst.inOrder(bst.root);
    }
}

