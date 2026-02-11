package binary_search_tree.MusicApp;

public class MainApp {
    public static void main(String[] args) {

        SongBST bst = new SongBST();

        // Scenario 2: Insert new tracks
        bst.root = bst.insert(bst.root, 103, "Believer");
        bst.root = bst.insert(bst.root, 101, "Shape of You");
        bst.root = bst.insert(bst.root, 105, "Senorita");
        bst.root = bst.insert(bst.root, 102, "Perfect");

        // Scenario 1: Search track
        System.out.println("Searching track ID 102:");
        SongNode s = bst.search(bst.root, 102);
        if (s != null) {
            System.out.println("Found: " + s.title);
        } else {
            System.out.println("Track not found");
        }

        // Scenario 3: Show playlist (sorted)
        System.out.println("\nPlaylist in sorted order:");
        bst.inOrder(bst.root);
    }
}

