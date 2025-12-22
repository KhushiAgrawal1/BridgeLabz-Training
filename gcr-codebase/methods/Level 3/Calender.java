import java.util.Scanner;
public class Calender
{
    public static boolean isLeap(int year)
	{
	    if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
		{
		return true;
		}
	return false;	
	}

    public static String getMonth(int month)
	{
	    String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", 
        "Aug", "Sep", "Oct", "Nov", "Dec"};
		
        return months[ month-1 ];		
	}
	
	public static int getDays(int month, int year)
	{
	    int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if ( month == 2 && isLeap(year) )
		{
		    return 29;
		}
        return days[month - 1];		
	}
	
	public static int getFirstDay(int month, int year)
	{
		int day = 1;
		int y0 = year - (14 - month) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = month + 12 * ((14 - month) / 12) - 2;
		int d0 = (day + x + (31*m0) / 12) % 7;
		return d0; // 0 = sun, 1= mon
	}
	
	public static void displayCalendar(int month, int year)
	{
	    String monthName = getMonth(month);
        int totalDays = getDays(month, year);
        int firstDay = getFirstDay(month, year);
        System.out.println("\n " + monthName + year);
 		System.out.println("Sun Mon Tue Wed Thu Fri Sat");
		
		for (int i = 0; i < firstDay; i++)    //friday
		{
			System.out.printf(" ");
        }

        for (int day = 1; day <= totalDays; day++)   
		{
			System.out.printf("%4d",day);  
			
            if ( (day + firstDay) % 7 == 0)
			{
				System.out.println();
			}			
 		}
		System.out.println();
	}	
	
    public static void main(String[] args)
	{
	    Scanner input = new Scanner(System.in);
		
		System.out.println("Enter month (1-12): ");
		int month = input.nextInt();
		
		System.out.println("Enter year: ");
		int year = input.nextInt();
		
		displayCalendar(month, year);		
	}
}