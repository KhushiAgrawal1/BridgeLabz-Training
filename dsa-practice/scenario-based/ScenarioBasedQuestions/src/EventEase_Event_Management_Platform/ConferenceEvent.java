package EventEase_Event_Management_Platform;

public class ConferenceEvent extends Event {

    public ConferenceEvent(int id, String name, String location, String date,
                            int attendees, boolean catering) {
        super(id, name, location, date, attendees, 10000);
        if (catering) updateCost(5000);
    }

    @Override
    public void schedule() {
        System.out.println("Conference scheduled 🏢");
    }
}

