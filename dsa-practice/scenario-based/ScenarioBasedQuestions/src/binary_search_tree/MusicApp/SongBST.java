package binary_search_tree.MusicApp;

public class SongBST {
    SongNode root;

    // Insert song
    public SongNode insert(SongNode root, int trackId, String title) {
        if (root == null) {
            return new SongNode(trackId, title);
        }

        if (trackId < root.trackId) {
            root.left = insert(root.left, trackId, title);
        } else if (trackId > root.trackId) {
            root.right = insert(root.right, trackId, title);
        }

        return root;
    }

    // Search song
    public SongNode search(SongNode root, int trackId) {
        if (root == null || root.trackId == trackId) {
            return root;
        }

        if (trackId < root.trackId) {
            return search(root.left, trackId);
        } else {
            return search(root.right, trackId);
        }
    }

    // In-order traversal (sorted by trackId)
    public void inOrder(SongNode root) {
        if (root != null) {
            inOrder(root.left);
            System.out.println(root.trackId + " - " + root.title);
            inOrder(root.right);
        }
    }
}
