package Linked_List.Circular_Linked_List.Online_Ticket_Reservation_System;

public class TicketCircularLinkedList {

    TicketNode head;

    // Add ticket at end
    void addTicket(int id, String customer, String movie, String seat, String time) {
        TicketNode newNode = new TicketNode(id, customer, movie, seat, time);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        TicketNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;
    }

    // Remove ticket by ID
    void removeTicket(int id) {
        if (head == null) return;

        TicketNode curr = head;
        TicketNode prev = null;

        do {
            if (curr.ticketId == id) {

                // Only one node
                if (curr == head && curr.next == head) {
                    head = null;
                }
                // Removing head
                else if (curr == head) {
                    TicketNode temp = head;
                    while (temp.next != head) {
                        temp = temp.next;
                    }
                    head = head.next;
                    temp.next = head;
                }
                // Removing middle/last
                else {
                    prev.next = curr.next;
                }
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);

        System.out.println("Ticket not found");
    }

    // Display all tickets
    void displayTickets() {
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

    // Search by customer name
    void searchByCustomer(String customer) {
        if (head == null) return;

        TicketNode temp = head;
        boolean found = false;

        do {
            if (temp.customerName.equalsIgnoreCase(customer)) {
                displayTicket(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found)
            System.out.println("No ticket found for this customer");
    }

    // Search by movie name
    void searchByMovie(String movie) {
        if (head == null) return;

        TicketNode temp = head;
        boolean found = false;

        do {
            if (temp.movieName.equalsIgnoreCase(movie)) {
                displayTicket(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found)
            System.out.println("No ticket found for this movie");
    }

    // Count total tickets
    int countTickets() {
        if (head == null) return 0;

        int count = 0;
        TicketNode temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);

        return count;
    }

    void displayTicket(TicketNode t) {
        System.out.println(
                "Ticket ID: " + t.ticketId +
                ", Customer: " + t.customerName +
                ", Movie: " + t.movieName +
                ", Seat: " + t.seatNumber +
                ", Time: " + t.bookingTime
        );
    }

    // Main method
    public static void main(String[] args) {
        TicketCircularLinkedList system = new TicketCircularLinkedList();

        system.addTicket(1, "Aman", "Inception", "A10", "10:30 AM");
        system.addTicket(2, "Riya", "Avatar", "B12", "01:00 PM");
        system.addTicket(3, "Karan", "Inception", "A11", "10:30 AM");

        System.out.println("All Booked Tickets:");
        system.displayTickets();

        System.out.println("\nSearch by Movie:");
        system.searchByMovie("Inception");

        system.removeTicket(2);

        System.out.println("\nAfter Cancellation:");
        system.displayTickets();

        System.out.println("\nTotal Tickets Booked: " + system.countTickets());
    }
}

