package avl_tree.Online_Ticket_Booking;

public class EventNode {
    int startTime;
    String eventName;
    int height;
    EventNode left, right;

    public EventNode(int startTime, String eventName) {
        this.startTime = startTime;
        this.eventName = eventName;
        this.height = 1;
    }
}

