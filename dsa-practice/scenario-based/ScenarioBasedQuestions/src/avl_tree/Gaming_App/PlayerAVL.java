package avl_tree.Gaming_App;

public class PlayerAVL {
    PlayerNode root;

    // Get height
    int height(PlayerNode n) {
        if (n == null) return 0;
        return n.height;
    }

    // Get balance factor
    int getBalance(PlayerNode n) {
        if (n == null) return 0;
        return height(n.left) - height(n.right);
    }

    // Right rotation
    PlayerNode rightRotate(PlayerNode y) {
        PlayerNode x = y.left;
        PlayerNode t2 = x.right;

        x.right = y;
        y.left = t2;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    // Left rotation
    PlayerNode leftRotate(PlayerNode x) {
        PlayerNode y = x.right;
        PlayerNode t2 = y.left;

        y.left = x;
        x.right = t2;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    // Insert or update player
    PlayerNode insert(PlayerNode node, int score, String name) {
        if (node == null)
            return new PlayerNode(score, name);

        if (score < node.score)
            node.left = insert(node.left, score, name);
        else if (score > node.score)
            node.right = insert(node.right, score, name);
        else {
            node.name = name; // update name if same score
            return node;
        }

        // update height
        node.height = 1 + Math.max(height(node.left), height(node.right));

        int balance = getBalance(node);

        // rotations
        // Left Left
        if (balance > 1 && score < node.left.score)
            return rightRotate(node);

        // Right Right
        if (balance < -1 && score > node.right.score)
            return leftRotate(node);

        // Left Right
        if (balance > 1 && score > node.left.score) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // Right Left
        if (balance < -1 && score < node.right.score) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    // Get min node
    PlayerNode minValueNode(PlayerNode node) {
        PlayerNode current = node;
        while (current.left != null)
            current = current.left;
        return current;
    }

    // Delete player
    PlayerNode delete(PlayerNode root, int score) {
        if (root == null)
            return root;

        if (score < root.score)
            root.left = delete(root.left, score);
        else if (score > root.score)
            root.right = delete(root.right, score);
        else {
            if (root.left == null || root.right == null) {
                PlayerNode temp = (root.left != null) ? root.left : root.right;

                if (temp == null) {
                    root = null;
                } else {
                    root = temp;
                }
            } else {
                PlayerNode temp = minValueNode(root.right);
                root.score = temp.score;
                root.name = temp.name;
                root.right = delete(root.right, temp.score);
            }
        }

        if (root == null)
            return root;

        // update height
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

    // Display top players (highest score first)
    void displayTop(PlayerNode root, int[] count) {
        if (root == null || count[0] >= 10)
            return;

        displayTop(root.right, count);

        if (count[0] < 10) {
            System.out.println(root.name + " - " + root.score);
            count[0]++;
        }

        displayTop(root.left, count);
    }
}
