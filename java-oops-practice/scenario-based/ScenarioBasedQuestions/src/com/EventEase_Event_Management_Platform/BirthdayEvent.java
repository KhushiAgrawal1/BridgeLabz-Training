package com.EventEase_Event_Management_Platform;

public class BirthdayEvent extends Event {

    public BirthdayEvent(int id, String name, String location, String date,
                          int attendees, boolean decoration) {
        super(id, name, location, date, attendees, 5000);
        if (decoration) updateCost(2000);
    }

    @Override
    public void schedule() {
        System.out.println("Birthday Party scheduled 🎂");
    }
}

