package Linked_List.Circular_Linked_List.Online_Ticket_Reservation_System;

public class TicketReservationApp {

    public static void main(String[] args) {

        TicketCircularLinkedList system = new TicketCircularLinkedList();

        system.addTicket(101, "Amit", "Inception", "A1", "10:00 AM");
        system.addTicket(102, "Riya", "Avatar", "B5", "1:00 PM");
        system.addTicket(103, "Neha", "Inception", "C3", "6:00 PM");

        System.out.println("All Booked Tickets:");
        system.displayTickets();

        System.out.println("\nSearch by Movie Name:");
        system.searchTicket("Inception");

        System.out.println("\nTotal Tickets: " + system.countTickets());

        System.out.println("\nRemoving Ticket ID 102");
        system.removeTicket(102);

        System.out.println("\nUpdated Ticket List:");
        system.displayTickets();
    }
}

