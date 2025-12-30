import java.util.Scanner;

public class TicketBooking
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int totalSeat = 3;	
		int bookedSeat = 0;

			System.out.println("Ticket Menu: ");
			System.out.println("1. AC ");
			System.out.println("2. Sleeper ");
			System.out.println("3. General ");
		
		while(totalSeat > bookedSeat){
			
			System.out.println();
			System.out.println("Enter ticket choice : ");
			int choice = sc.nextInt();
		
		switch (choice)
		{
			case 1:
			bookedSeat++;
			System.out.println("1 AC Ticket Booked. You have : " + bookedSeat + " bookings. ");
			break;
			
			case 2:
			bookedSeat++;
			System.out.println("1 Sleeper Ticket Booked. You have : " + bookedSeat + " bookings. " );			
			break;
			
			case 3:
			bookedSeat++;
			System.out.println("1 General Ticket Booked. You have : " + bookedSeat + " bookings. ");			
			break;
			
			default:
			System.out.println("Invalid Input");
			
		}
			System.out.println();
		}
			System.out.println("Train filled);
	}
}