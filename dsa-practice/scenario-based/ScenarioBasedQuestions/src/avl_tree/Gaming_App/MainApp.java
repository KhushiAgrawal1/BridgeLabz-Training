package avl_tree.Gaming_App;

public class MainApp {
    public static void main(String[] args) {

        PlayerAVL avl = new PlayerAVL();

        // Scenario 1: Insert/Update players
        avl.root = avl.insert(avl.root, 1200, "Amit");
        avl.root = avl.insert(avl.root, 1500, "Neha");
        avl.root = avl.insert(avl.root, 1100, "Rahul");
        avl.root = avl.insert(avl.root, 1800, "Priya");
        avl.root = avl.insert(avl.root, 1600, "Rohan");

        // Scenario 2: Display top players
        System.out.println("Top Players:");
        int[] count = {0};
        avl.displayTop(avl.root, count);

        // Scenario 3: Remove player
        System.out.println("\nRemoving player with score 1500...");
        avl.root = avl.delete(avl.root, 1500);

        System.out.println("\nTop Players after removal:");
        count[0] = 0;
        avl.displayTop(avl.root, count);
    }
}

