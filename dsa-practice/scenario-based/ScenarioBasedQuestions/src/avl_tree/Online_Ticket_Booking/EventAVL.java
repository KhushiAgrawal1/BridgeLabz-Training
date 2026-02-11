package avl_tree.Online_Ticket_Booking;

public class EventAVL {
    EventNode root;

    // Get height
    int height(EventNode n) {
        if (n == null) return 0;
        return n.height;
    }

    // Get balance factor
    int getBalance(EventNode n) {
        if (n == null) return 0;
        return height(n.left) - height(n.right);
    }

    // Right rotation
    EventNode rightRotate(EventNode y) {
        EventNode x = y.left;
        EventNode t2 = x.right;

        x.right = y;
        y.left = t2;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    // Left rotation
    EventNode leftRotate(EventNode x) {
        EventNode y = x.right;
        EventNode t2 = y.left;

        y.left = x;
        x.right = t2;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    // Insert event
    EventNode insert(EventNode node, int time, String name) {
        if (node == null)
            return new EventNode(time, name);

        if (time < node.startTime)
            node.left = insert(node.left, time, name);
        else if (time > node.startTime)
            node.right = insert(node.right, time, name);
        else
            return node; // no duplicate times

        node.height = 1 + Math.max(height(node.left), height(node.right));

        int balance = getBalance(node);

        // rotations
        if (balance > 1 && time < node.left.startTime)
            return rightRotate(node);

        if (balance < -1 && time > node.right.startTime)
            return leftRotate(node);

        if (balance > 1 && time > node.left.startTime) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        if (balance < -1 && time < node.right.startTime) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    // Find min
    EventNode minValueNode(EventNode node) {
        EventNode current = node;
        while (current.left != null)
            current = current.left;
        return current;
    }

    // Delete event
    EventNode delete(EventNode root, int time) {
        if (root == null)
            return root;

        if (time < root.startTime)
            root.left = delete(root.left, time);
        else if (time > root.startTime)
            root.right = delete(root.right, time);
        else {
            if (root.left == null || root.right == null) {
                EventNode temp = (root.left != null) ? root.left : root.right;

                if (temp == null) {
                    root = null;
                } else {
                    root = temp;
                }
            } else {
                EventNode temp = minValueNode(root.right);
                root.startTime = temp.startTime;
                root.eventName = temp.eventName;
                root.right = delete(root.right, temp.startTime);
            }
        }

        if (root == null)
            return root;

        root.height = 1 + Math.max(height(root.left), height(root.right));

        int balance = getBalance(root);

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

    // In-order traversal (upcoming events)
    void inOrder(EventNode root) {
        if (root != null) {
            inOrder(root.left);
            System.out.println(root.startTime + " - " + root.eventName);
            inOrder(root.right);
        }
    }
}

