package avl_tree.Online_Ticket_Booking;

public class MainApp {
    public static void main(String[] args) {

        EventAVL avl = new EventAVL();

        // Scenario 1: Insert events
        avl.root = avl.insert(avl.root, 1800, "Music Concert");
        avl.root = avl.insert(avl.root, 1400, "Tech Seminar");
        avl.root = avl.insert(avl.root, 2000, "Comedy Show");
        avl.root = avl.insert(avl.root, 1600, "Art Exhibition");

        // Scenario 3: Show events in order
        System.out.println("Upcoming Events:");
        avl.inOrder(avl.root);

        // Scenario 2: Cancel event
        System.out.println("\nCancelling event at 1600...");
        avl.root = avl.delete(avl.root, 1600);

        System.out.println("\nEvents after cancellation:");
        avl.inOrder(avl.root);
    }
}

