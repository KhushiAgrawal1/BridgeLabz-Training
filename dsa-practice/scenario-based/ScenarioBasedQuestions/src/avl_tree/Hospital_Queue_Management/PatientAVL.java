package avl_tree.Hospital_Queue_Management;

public class PatientAVL {
    PatientNode root;

    int height(PatientNode n) {
        if (n == null) return 0;
        return n.height;
    }

    int getBalance(PatientNode n) {
        if (n == null) return 0;
        return height(n.left) - height(n.right);
    }

    // Right rotate
    PatientNode rightRotate(PatientNode y) {
        PatientNode x = y.left;
        PatientNode t2 = x.right;

        x.right = y;
        y.left = t2;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    // Left rotate
    PatientNode leftRotate(PatientNode x) {
        PatientNode y = x.right;
        PatientNode t2 = y.left;

        y.left = x;
        x.right = t2;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    // Insert patient
    PatientNode insert(PatientNode node, int time, String name) {
        if (node == null)
            return new PatientNode(time, name);

        if (time < node.checkInTime)
            node.left = insert(node.left, time, name);
        else if (time > node.checkInTime)
            node.right = insert(node.right, time, name);
        else
            return node;

        node.height = 1 + Math.max(height(node.left), height(node.right));
        int balance = getBalance(node);

        // rotations
        if (balance > 1 && time < node.left.checkInTime)
            return rightRotate(node);

        if (balance < -1 && time > node.right.checkInTime)
            return leftRotate(node);

        if (balance > 1 && time > node.left.checkInTime) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        if (balance < -1 && time < node.right.checkInTime) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    // Find minimum
    PatientNode minValueNode(PatientNode node) {
        PatientNode current = node;
        while (current.left != null)
            current = current.left;
        return current;
    }

    // Delete patient
    PatientNode delete(PatientNode root, int time) {
        if (root == null)
            return root;

        if (time < root.checkInTime)
            root.left = delete(root.left, time);
        else if (time > root.checkInTime)
            root.right = delete(root.right, time);
        else {
            if (root.left == null || root.right == null) {
                PatientNode temp = (root.left != null) ? root.left : root.right;

                if (temp == null) {
                    root = null;
                } else {
                    root = temp;
                }
            } else {
                PatientNode temp = minValueNode(root.right);
                root.checkInTime = temp.checkInTime;
                root.patientName = temp.patientName;
                root.right = delete(root.right, temp.checkInTime);
            }
        }

        if (root == null)
            return root;

        root.height = 1 + Math.max(height(root.left), height(root.right));
        int balance = getBalance(root);

        // balancing
        if (balance > 1 && getBalance(root.left) >= 0)
            return rightRotate(root);

        if (balance > 1 && getBalance(root.left) < 0) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        if (balance < -1 && getBalance(root.right) <= 0)
            return leftRotate(root);

        if (balance < -1 && getBalance(root.right) > 0) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root;
    }

    // Display patients by arrival time
    void inOrder(PatientNode root) {
        if (root != null) {
            inOrder(root.left);
            System.out.println(root.checkInTime + " - " + root.patientName);
            inOrder(root.right);
        }
    }
}

