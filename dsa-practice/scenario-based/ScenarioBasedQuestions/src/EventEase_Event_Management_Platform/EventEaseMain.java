package EventEase_Event_Management_Platform;

public class EventEaseMain {
    public static void main(String[] args) {

        User organizer = new User("Khushi", "khushi@gmail.com");

        Event event = new BirthdayEvent(
                101, "Khushi's Birthday", "Indore",
                "10-02-2026", 50, true);

        event.schedule();                 // Polymorphism
        System.out.println("Total Cost: ₹" + event.getCost());
    }
}
