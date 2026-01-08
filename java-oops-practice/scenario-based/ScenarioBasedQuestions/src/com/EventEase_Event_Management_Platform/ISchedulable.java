package com.EventEase_Event_Management_Platform;

public interface ISchedulable {
    void schedule();
    void reschedule(String newDate);
    void cancel();
}

