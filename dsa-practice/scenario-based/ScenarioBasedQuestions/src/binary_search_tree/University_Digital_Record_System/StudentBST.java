package binary_search_tree.University_Digital_Record_System;

public class StudentBST {
    StudentNode root;

    // Insert student
    public StudentNode insert(StudentNode root, int rollNo, String name) {
        if (root == null) {
            return new StudentNode(rollNo, name);
        }

        if (rollNo < root.rollNo) {
            root.left = insert(root.left, rollNo, name);
        } else if (rollNo > root.rollNo) {
            root.right = insert(root.right, rollNo, name);
        }

        return root;
    }

    // Search student
    public StudentNode search(StudentNode root, int rollNo) {
        if (root == null || root.rollNo == rollNo) {
            return root;
        }

        if (rollNo < root.rollNo) {
            return search(root.left, rollNo);
        } else {
            return search(root.right, rollNo);
        }
    }

    // Find minimum
    public StudentNode findMin(StudentNode root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    // Delete student
    public StudentNode delete(StudentNode root, int rollNo) {
        if (root == null) {
            return null;
        }

        if (rollNo < root.rollNo) {
            root.left = delete(root.left, rollNo);
        } else if (rollNo > root.rollNo) {
            root.right = delete(root.right, rollNo);
        } else {
            // case 1: no child
            if (root.left == null && root.right == null) {
                return null;
            }
            // case 2: one child
            else if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            // case 3: two children
            StudentNode min = findMin(root.right);
            root.rollNo = min.rollNo;
            root.name = min.name;
            root.right = delete(root.right, min.rollNo);
        }
        return root;
    }

    // In-order traversal (sorted roll numbers)
    public void inOrder(StudentNode root) {
        if (root != null) {
            inOrder(root.left);
            System.out.println(root.rollNo + " - " + root.name);
            inOrder(root.right);
        }
    }
}
