package Linked_List.Circular_Linked_List.Online_Ticket_Reservation_System;

public class TicketCircularLinkedList {

    private TicketNode head = null;
    private TicketNode tail = null;

    // Add ticket at end
    public void addTicket(int id, String customer, String movie,
                          String seat, String time) {

        TicketNode newNode = new TicketNode(id, customer, movie, seat, time);

        if (head == null) {
            head = tail = newNode;
            tail.next = head;
            return;
        }

        tail.next = newNode;
        tail = newNode;
        tail.next = head;
    }

    // Remove ticket by Ticket ID
    public void removeTicket(int ticketId) {
        if (head == null) {
            System.out.println("No tickets booked");
            return;
        }

        TicketNode current = head;
        TicketNode prev = tail;

        do {
            if (current.ticketId == ticketId) {

                if (current == head) {
                    head = head.next;
                    tail.next = head;
                } else if (current == tail) {
                    tail = prev;
                    tail.next = head;
                } else {
                    prev.next = current.next;
                }

                System.out.println("Ticket removed successfully");
                return;
            }

            prev = current;
            current = current.next;
        } while (current != head);

        System.out.println("Ticket not found");
    }

    // Search by Customer or Movie
    public void searchTicket(String keyword) {
        if (head == null) {
            System.out.println("No tickets available");
            return;
        }

        TicketNode temp = head;
        boolean found = false;

        do {
            if (temp.customerName.equalsIgnoreCase(keyword)
                    || temp.movieName.equalsIgnoreCase(keyword)) {

                displayTicket(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("No matching ticket found");
        }
    }

    // Display all tickets
    public void displayTickets() {
        if (head == null) {
            System.out.println("No tickets booked");
            return;
        }

        TicketNode temp = head;
        do {
            displayTicket(temp);
            temp = temp.next;
        } while (temp != head);
    }

    // Count total tickets
    public int countTickets() {
        if (head == null) return 0;

        int count = 0;
        TicketNode temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);

        return count;
    }

    private void displayTicket(TicketNode t) {
        System.out.println(
                "Ticket ID: " + t.ticketId +
                ", Customer: " + t.customerName +
                ", Movie: " + t.movieName +
                ", Seat: " + t.seatNumber +
                ", Time: " + t.bookingTime
        );
    }
}
