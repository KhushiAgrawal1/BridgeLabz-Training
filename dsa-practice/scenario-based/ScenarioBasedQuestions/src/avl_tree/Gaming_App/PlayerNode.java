package avl_tree.Gaming_App;

public class PlayerNode {
    int score;
    String name;
    int height;
    PlayerNode left, right;

    public PlayerNode(int score, String name) {
        this.score = score;
        this.name = name;
        this.height = 1;
    }
}

