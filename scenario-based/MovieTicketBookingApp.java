import java.util.Scanner;

public class MovieTicketBookingApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char continueBooking;

        do {
            int ticketPrice = 0;
            int snackPrice = 0;

            // Movie type
            System.out.println("\nSelect Movie Type:");
            System.out.println("1. Action");
            System.out.println("2. Comedy");
            System.out.println("3. Drama");
            System.out.print("Enter choice: ");
            int movieType = sc.nextInt();

            switch (movieType) {
                case 1:
                    ticketPrice = 200;
                    break;
                case 2:
                    ticketPrice = 180;
                    break;
                case 3:
                    ticketPrice = 150;
                    break;
                default:
                    System.out.println("Invalid movie type!");
            }

            // Seat type
            System.out.print("Enter Seat Type (Gold/Silver): ");
            String seatType = sc.next();

            if (seatType.equalsIgnoreCase("Gold")) {
                ticketPrice += 100;
            } else if (seatType.equalsIgnoreCase("Silver")) {
                ticketPrice += 50;
            } else {
                System.out.println("Invalid seat type!");
            }

            // Snacks option
            System.out.print("Do you want snacks? (yes/no): ");
            String snacks = sc.next();

            if (snacks.equalsIgnoreCase("yes")) {
                snackPrice = 80;
            }

            // Total bill
            int totalAmount = ticketPrice + snackPrice;

            System.out.println("\n----- Booking Summary -----");
            System.out.println("Ticket Price : ₹" + ticketPrice);
            System.out.println("Snack Price  : ₹" + snackPrice);
            System.out.println("Total Amount : ₹" + totalAmount);

            // Loop for next customer
            System.out.print("\nBook ticket for next customer? (y/n): ");
            continueBooking = sc.next().charAt(0);

        } while (continueBooking == 'y' || continueBooking == 'Y');

        System.out.println("\nThank you for using Movie Ticket Booking App 🎉");
        sc.close();
    }
}
