package com.ParkEase_Smart_Parking_Management_System;

public class ParkingService {
    private BookingLog bookingLog;

    public void assignSlot(ParkingSlot slot, Vehicle vehicle) {
        if (slot.isAvailable()) {
            slot.occupySlot();
            bookingLog = new BookingLog(
                    "Vehicle " + vehicle.getVehicleNumber() +
                    " parked at slot " + slot.getSlotId()
            );
        }
    }

    public void releaseSlot(ParkingSlot slot) {
        slot.freeSlot();
        bookingLog = new BookingLog(
                "Slot " + slot.getSlotId() + " is now free"
        );
    }

    // Access booking records safely
    public String getBookingLog() {
        return bookingLog.getLogMessage();
    }
}
